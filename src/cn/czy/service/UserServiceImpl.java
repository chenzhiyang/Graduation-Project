package cn.czy.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czy.dao.UserMapper;
import cn.czy.pojo.User;
import cn.czy.pojo.UserExample;
import cn.czy.pojo.UserExample.Criteria;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean register(User user) throws Exception {
		userMapper.insertSelective(user);
		return user.getId()>0;
	}

	@Override
	public List<User> loginCheck(String userName, String pwd) throws Exception {
		UserExample userExample=new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andUsernameEqualTo(userName);
		createCriteria.andPasswordEqualTo(pwd);
		List<User> selectByExample = userMapper.selectByExample(userExample);
		return selectByExample;
	}

}
