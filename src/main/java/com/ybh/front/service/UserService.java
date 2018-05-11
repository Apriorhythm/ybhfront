package com.ybh.front.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybh.front.mapper.USERMapper;
import com.ybh.front.model.USER;
import com.ybh.front.model.USERExample;

@Service
public class UserService {

	@Autowired
	private USERMapper userMapper;

	public USERMapper getUserMapper() {
		return userMapper;
	}
	
	public List<USER> getUserById(String id){
		USERExample userExample = new USERExample();
		userExample.createCriteria().andIdEqualTo(Integer.parseInt(id));
		return userMapper.selectByExample(userExample);
	}
	
	
	public List<USER> getUserByUsernameAndPassword(String username, String password){
		USERExample userExample = new USERExample();
		userExample.createCriteria().andUsernameEqualTo(username)
			.andPasswordEqualTo(password);

		return userMapper.selectByExample(userExample);
	}

}

