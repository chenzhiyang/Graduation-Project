package cn.czy.service;



import cn.czy.pojo.Joined;


public interface JoinService {

	public boolean insertJoin(Joined joined)throws Exception;
	
	public int deleteJoin(int activityId) throws Exception;
	
	public boolean deleteJoinByUserIdAndActivityId(int uId,int aId);
	
	
}
