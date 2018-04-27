package cn.czy.controller;



import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.xalan.internal.lib.ExsltBase;

import cn.czy.pojo.Activity;
import cn.czy.pojo.Joined;
import cn.czy.pojo.ResumeWithBLOBs;
import cn.czy.service.ActivityService;
import cn.czy.service.JoinService;
import cn.czy.service.ResumeService;


@Controller
@RequestMapping("/User")
public class UserController {

	@Autowired
	private JoinService joinService;
	
	@Autowired
	private ResumeService resumeService;
	
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping("/resume/{userId}")
	public String findResumeByUserId(@PathVariable("userId") int userId,Model model) throws Exception{
	
		ResumeWithBLOBs resume = resumeService.findResumeByUserId(userId);
		model.addAttribute("resume", resume);
		return "resume";
	}
	
	@RequestMapping("/editResume/{userId}")
	public String editReusme(@PathVariable("userId") int userId,Model model)throws Exception{
		ResumeWithBLOBs resume = resumeService.findResumeByUserId(userId);
		model.addAttribute("resume", resume);
		return "editResume";
	}
	
	@RequestMapping("/updateResume")
	public String updateResumeById(ResumeWithBLOBs resumeWithBLOBs) throws Exception{
		resumeService.updateResume(resumeWithBLOBs);
		return "forward:resume/"+resumeWithBLOBs.getUserId();
	}
	
	@RequestMapping("/activity/{userId}")
	public String findActivityByUserId(@PathVariable("userId") int userId,Model model) throws Exception{
		List<Activity> findMyActivity = activityService.findMyActivity(userId);
		List<Activity> findJoinedActivity = activityService.findJoinedActivity(userId);
		model.addAttribute("activity1", findMyActivity);
		model.addAttribute("activity2", findJoinedActivity);
		return "activity";
	}
	
	@RequestMapping("/editActivity/{Id}")
	public String editActivity(@PathVariable("Id") int Id,Model model)throws Exception{
		Activity activity=activityService.findActivityById(Id);
		model.addAttribute("activity", activity);
		return "editActivity";
	}
	
	@RequestMapping("/updateActivity")
	public String updateActivityById(Activity activity,HttpServletRequest request)throws Exception{
		activityService.updateActivityById(activity);
		HttpSession session = request.getSession();
		return "forward:activity/"+session.getAttribute("userId");
	}
	
	@RequestMapping("/deleteActivity/{Id}")
	public String deleteActivityById(@PathVariable("Id") int Id,HttpServletRequest request)throws Exception{
		activityService.deleteActivity(Id);
		joinService.deleteJoin(Id);
		HttpSession session = request.getSession();
		return "redirect:/User/activity/"+session.getAttribute("userId");
	}
	
	@RequestMapping("/addActivity")
	public String addActivity()throws Exception{
		return "addActivity";
	}
	
	@RequestMapping("/insertActivity")
	public String insertActivity(Activity activity,HttpServletRequest request)throws Exception{
		activity.setStatus((byte) 0);
		int acticityId=activityService.addActivity(activity);
		Joined join=new Joined();
		int userId = (int) request.getSession().getAttribute("userId");
		join.setUserId(userId);
		join.setCreatetime(new Date());
		join.setActicityId(acticityId);
		join.setIsjoin((byte) 1);
		joinService.insertJoin(join);
		return "forward:activity/"+userId;
	}
	
	@RequestMapping("/exitActivity/{ActivityId}")
	public String exitActivityByUserIdAndActivityId(@PathVariable("ActivityId") int ActivityId,
			HttpServletRequest request)throws Exception{
		HttpSession session = request.getSession();
		int userId=(int) session.getAttribute("userId");
		joinService.deleteJoinByUserIdAndActivityId(userId, ActivityId);
		return "redirect:/User/activity/"+userId;
	}
	
	@RequestMapping("/findActivityJoiner/{ActivityId}")
	public String findActivityJoiner(@PathVariable("ActivityId") int activityId,Model model)throws Exception{
		List<ResumeWithBLOBs> list=resumeService.findActivityJoinerByActivityId(activityId);
		model.addAttribute("resumeList", list);
		return "joinerList";
	}
	
	@RequestMapping("/invite/{ActivityId}")
	public String inviteByActivityId(@PathVariable("ActivityId") int activityId,Model model)throws Exception{
		model.addAttribute("ActivityId", activityId);
		return "invite";
	}
	
	@RequestMapping("/inviteSearch")
	public String inviteSearchByKeyValue(int ActivityId,String skill,String department,Model model)throws Exception{
		List<ResumeWithBLOBs> list=resumeService.SearchResumeByKeyValue(skill, department);
		model.addAttribute("resumeList", list);
		
		return "forward:invite/"+ActivityId;
	}
}
