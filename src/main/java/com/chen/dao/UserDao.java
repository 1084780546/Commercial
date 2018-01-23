package com.chen.dao;

import org.apache.ibatis.annotations.Mapper;

import com.chen.model.User;

@Mapper
public interface UserDao {

	User getUserByUid(Integer uid);

	void addUser(User user);

	void updUser(User user);

}
