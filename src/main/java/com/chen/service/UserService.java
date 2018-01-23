package com.chen.service;

import com.chen.model.User;

public interface UserService {

	User getUserByUid(Integer uid);

	void addUser(User user);

	void updUser(User user);

}
