package com.lkp.composedemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 *@className User
 *@description TODO
 *@Auther 85291173@qq.com
 *@Date 2019/5/29 10:35
 *@Version
 */
@Table(name = "user")
@Entity
public class UserEntity {
	
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
	@GeneratedValue(generator="idGenerator")
	@Column(name = "id",length = 36)
	private String id;
	private String name;
	private int age ;
	private String phone ;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public UserEntity(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public UserEntity() {
	}
	
	@Override
	public String toString() {
		return "UserEntity{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				", phone='" + phone + '\'' +
				'}';
	}
}
