package cn.czy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.czy.dao.ResumeMapper;
import cn.czy.pojo.Resume;
import cn.czy.pojo.ResumeExample;
import cn.czy.pojo.ResumeExample.Criteria;
import cn.czy.pojo.ResumeWithBLOBs;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private ResumeMapper resumeMapper;
	
	@Override
	public ResumeWithBLOBs findResumeByUserId(int userId) throws Exception {
		ResumeExample resumeExample = new ResumeExample(); 
		Criteria createCriteria = resumeExample.createCriteria();
		createCriteria.andUserIdEqualTo(userId);
		List<ResumeWithBLOBs> selectByExampleWithBLOBs = resumeMapper.selectByExampleWithBLOBs(resumeExample);
		return selectByExampleWithBLOBs.get(0);
	}

	@Override
	public boolean insertResume(ResumeWithBLOBs resumeWithBLOBs) throws Exception {
		 resumeMapper.insertSelective(resumeWithBLOBs);
		 return resumeWithBLOBs.getId()>0;
	}

	@Override
	public boolean updateResume(ResumeWithBLOBs resumeWithBLOBs) throws Exception {
		return resumeMapper.updateByPrimaryKeySelective(resumeWithBLOBs)>0;
	}

	@Override
	public List<ResumeWithBLOBs> findActivityJoinerByActivityId(int activityId) throws Exception {
		List<ResumeWithBLOBs> resumeList = resumeMapper.findActivityJoinerByActivityId(activityId);
		return resumeList;
	}

	@Override
	public List<ResumeWithBLOBs> SearchResumeByKeyValue(String skill, String department) throws Exception {
		ResumeWithBLOBs resume=new ResumeWithBLOBs();
		resume.setDepartment(department);
		resume.setSkill(skill);
		List<ResumeWithBLOBs> list = resumeMapper.searchResumeBySkillAndDepart(resume);
		return list;
	}

	

}
