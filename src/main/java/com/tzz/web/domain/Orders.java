package com.tzz.web.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable{

	private static final long serialVersionUID = 258485479423870157L;
	
	private Integer id;
	/** 订单号 */
	private String orderNum;
	/** 创建日期 */
	private Date createDate;
	
	private OrderType orderType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}
	
}
