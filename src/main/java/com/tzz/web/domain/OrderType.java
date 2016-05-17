package com.tzz.web.domain;

import java.io.Serializable;

public class OrderType implements Serializable{

	private static final long serialVersionUID = -3948624089526543247L;

	private Integer id;
	
	private String orderType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	
}
