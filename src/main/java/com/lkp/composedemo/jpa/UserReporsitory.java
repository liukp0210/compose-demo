package com.lkp.composedemo.jpa;

import com.lkp.composedemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @className UserReporsitory
 * @description TODO
 * @Auther 85291173@qq.com
 * @Date 2019/5/29 10:46
 * @Version
 */
public interface UserReporsitory extends JpaRepository<UserEntity,String>{
	UserEntity findByName(String name);
}
