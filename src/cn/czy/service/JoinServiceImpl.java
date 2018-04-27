package cn.czy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.regexp.internal.recompile;

import cn.czy.dao.JoinedMapper;
import cn.czy.pojo.Joined;
import cn.czy.pojo.JoinedExample;
import cn.czy.pojo.JoinedExample.Criteria;
import cn.czy.pojo.Resume;

@Service
public class JoinServiceImpl implements JoinService {

	@Autowired
	private JoinedMapper joinMapper;

	@Override
	public boolean insertJoin(Joined joined) throws Exception {
		
		return joinMapper.insertSelective(joined)>0;
	}

	@Override
	public int deleteJoin(int activityId) throws Exception {
		JoinedExample joinedExample=new JoinedExample();
		Criteria createCriteria = joinedExample.createCriteria();
		createCriteria.andActicityIdEqualTo(activityId);
		return joinMapper.deleteByExample(joinedExample);
	}

	@Override
	public boolean deleteJoinByUserIdAndActivityId(int uId, int aId) {
		JoinedExample joinedExample=new JoinedExample();
		Criteria createCriteria = joinedExample.createCriteria();
		createCriteria.andUserIdEqualTo(uId);
		createCriteria.andActicityIdEqualTo(aId);
		return joinMapper.deleteByExample(joinedExample)>0;
	}

	
	
	
}
