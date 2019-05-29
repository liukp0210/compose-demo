package com.lkp.composedemo.jpa;

import com.lkp.composedemo.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


/**
 * @className UserReporsitoryTest
 * @description TODO
 * @Auther 85291173@qq.com
 * @Date 2019/5/29 10:48
 * @Version
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserReporsitoryTest {
	
	@Autowired
	UserReporsitory userReporsitory;
	@Test
	public void findByName() throws Exception {
		UserEntity name = userReporsitory.findByName("张三");
		System.out.println(name.toString());
	}
	
	@Test
	public void save() throws Exception {
		userReporsitory.save(new UserEntity("张三",18,"13838385438"));
	}
	
	
}