package com.chen.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import com.chen.model.User;

@Component
public class RedisDaoImpl {
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	public Integer getUid(User user) { 
		ValueOperations<String, String> value = stringRedisTemplate.opsForValue();
		value.increment("next_uid", 1);
		String uid = value.get("next_uid");
		return Integer.parseInt(uid);
		
	}

}
