package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	

	@Override
	public User Login(String userID, String password) {
		return userMapper.Login(userID, password);
	}

	@Override
	public User FindID(String email) {
		return userMapper.FindID(email);
	}

	@Override
	public User FindPW(String usermail, String userID) {
		return userMapper.FindPW(usermail, userID);
	}



}
