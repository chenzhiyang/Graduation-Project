package cn.czy.service;

import java.util.List;


import cn.czy.pojo.User;

public interface UserService {

	public boolean register(User user) throws Exception;
	
	public List<User> loginCheck(String userName,String pwd) throws Exception;
	
	
}
