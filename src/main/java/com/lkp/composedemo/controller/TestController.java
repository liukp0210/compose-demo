package com.lkp.composedemo.controller;

import com.lkp.composedemo.entity.UserEntity;
import com.lkp.composedemo.jpa.UserReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@className TestController
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/5/29 10:34
 *@Version
 */
@RestController
public class TestController {
	
	private final UserReporsitory userReporsitory;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	public TestController(UserReporsitory userReporsitory) {
		this.userReporsitory = userReporsitory;
	}
	
	@GetMapping("getUserInfo")
	public String getUserInfo(String name){
		UserEntity userEntity = userReporsitory.findByName(name);
		return userEntity.toString();
	}
	
	@GetMapping("setRedis")
	public String setRedis(String key,String val){
		redisTemplate.opsForValue().set(key,val);
		
		return "成功";
	}
	
	@GetMapping("getRedisName")
	public Object getRedisName(String key){
		Object o = redisTemplate.opsForValue().get(key);
		return o;
	}
}
