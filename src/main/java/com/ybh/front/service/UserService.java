package com.ybh.front.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybh.front.mapper.UserMapper;
import com.ybh.front.model.User;
import com.ybh.front.model.UserExample;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}
	
	public List<User> findUser(){
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIdEqualTo(2);
		return userMapper.selectByExample(userExample);
	}
	
	
	
	public void setAdminMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}

