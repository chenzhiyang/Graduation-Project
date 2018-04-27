package cn.czy.service;


import java.util.List;

import cn.czy.pojo.Resume;
import cn.czy.pojo.ResumeWithBLOBs;

public interface ResumeService {

	public ResumeWithBLOBs findResumeByUserId(int userId) throws Exception;
	
	public boolean insertResume(ResumeWithBLOBs resumeWithBLOBs) throws Exception;
	
	public boolean updateResume(ResumeWithBLOBs resumeWithBLOBs) throws Exception;
	
	public List<ResumeWithBLOBs> findActivityJoinerByActivityId(int activityId) throws Exception;
	
	public List<ResumeWithBLOBs> SearchResumeByKeyValue(String skill,String department) throws Exception;
}
