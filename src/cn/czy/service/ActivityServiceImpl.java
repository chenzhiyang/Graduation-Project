package cn.czy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czy.dao.ActivityMapper;
import cn.czy.pojo.Activity;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityMapper activityMapper;
	
	@Override
	public List<Activity> findMyActivity(int userId) throws Exception {
		List<Activity> findMyActivity = activityMapper.findMyActivity(userId);
		return findMyActivity;
	}

	@Override
	public List<Activity> findJoinedActivity(int userId) throws Exception {
		List<Activity> findJoinedActivity = activityMapper.findJoinedActivity(userId);
		return findJoinedActivity;
	}

	@Override
	public int updateActivityById(Activity activity) throws Exception {
		return activityMapper.updateByPrimaryKey(activity);
	}

	@Override
	public Activity findActivityById(int id) throws Exception {
		Activity selectByPrimaryKey = activityMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	@Override
	public boolean deleteActivity(int id) throws Exception {
		return activityMapper.deleteByPrimaryKey(id)>0;
	}

	@Override
	public int addActivity(Activity activity) throws Exception {
		activityMapper.insertSelective(activity);
		return activity.getId();
	}
	

}
