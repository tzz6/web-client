package com.tzz.rmi;

import java.io.Serializable;

//注意对象必须继承Serializable
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = -1305713480759530889L;
	
	private Integer id;
	private String name;
	private int age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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

}
