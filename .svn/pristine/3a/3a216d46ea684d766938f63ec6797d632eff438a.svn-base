package com.chen.service.impl;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.dao.UserDao;
import com.chen.model.User;
import com.chen.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByUid(Integer uid) {
		return userDao.getUserByUid(uid);
	}

	@Override
	@Transactional
	public void addUser(User user) {
		Format format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = format.format(new Date());
		user.setRegTime(date);
		user.setStatus(1);
		userDao.addUser(user);
		
	}

	@Override
	public void updUser(User user) {
		userDao.updUser(user);
		
	}

}
