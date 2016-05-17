package com.tzz.web.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * 角色
 */
public class Role implements Serializable{

	private static final long serialVersionUID = 8888233717801480088L;
	
	private Long id;
	private String name;

	/** 与User多对多的双向关联关系 */
	private Set<User> users = new HashSet<User>();

	/** Department与Role多对一的关系 */
	private Department department;

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
