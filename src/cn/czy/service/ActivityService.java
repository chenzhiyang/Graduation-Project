package cn.czy.service;

import java.util.List;

import cn.czy.pojo.Activity;

public interface ActivityService {

	public List<Activity> findMyActivity(int userId) throws Exception;
	
	public List<Activity> findJoinedActivity(int userId) throws Exception;
	
	public Activity findActivityById(int id) throws Exception;
	
	public int updateActivityById(Activity activity) throws Exception;
	
	public boolean deleteActivity(int id) throws Exception;
	
	public int addActivity(Activity activity) throws Exception;
}
