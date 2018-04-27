package cn.czy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.czy.pojo.ResumeWithBLOBs;
import cn.czy.pojo.User;
import cn.czy.service.ResumeService;
import cn.czy.service.UserService;

@Controller
@RequestMapping("/Login")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private ResumeService resumeService;
	
	@RequestMapping("/login")
	public String login(String username,String pwd,HttpServletRequest request) throws Exception {
		List<User> user = userService.loginCheck(username, pwd);
		HttpSession session = request.getSession();
		if(user.get(0).getUsername()!=null&&user.get(0).getUsername().trim().length()!=0)
		{
			session.setAttribute("username", username);
			session.setAttribute("userId", user.get(0).getId());
			return "home";
		}
		return "login";
	} 
	
	@RequestMapping("/reg")
	public String reg(User user) throws Exception{
		if (user.getUsername()!=null&&user.getUsername().trim().length()!=0) {
			userService.register(user);
			ResumeWithBLOBs resumeWithBLOBs = new ResumeWithBLOBs();
			resumeWithBLOBs.setUserId(user.getId());
			resumeWithBLOBs.setName(user.getUsername());
			resumeService.insertResume(resumeWithBLOBs);
			return "login";
		}
		return "register";
	}
}
