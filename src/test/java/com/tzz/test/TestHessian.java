package com.tzz.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tzz.hessian.service.HsOrdersService;
import com.tzz.web.domain.Orders;


public class TestHessian {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext contex = new ClassPathXmlApplicationContext("remote-client.xml");  
		  
        // 获得客户端的Hessian代理工厂bean  
		HsOrdersService hsOrdersService = (HsOrdersService) contex.getBean("hsOrdersService");
		List<Orders> orders = hsOrdersService.findAllOrders();
		orders.forEach((Orders o) -> System.out.println(o.getId() + "--" + o.getOrderNum()));
	}
}
