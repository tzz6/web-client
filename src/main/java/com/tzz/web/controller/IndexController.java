package com.tzz.web.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tzz.hessian.service.HsOrdersService;
import com.tzz.ws.cxf.service.Orders;
import com.tzz.ws.cxf.service.WsOrdersService;
import com.tzz.ws.cxf.service.impl.WsOrdersServiceImpl;

/***
 * 客户端
 *
 */
@Controller
public class IndexController {
	
	@Autowired
	private HsOrdersService hsOrdersService;

	/** 首页 */
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index() {
		return "/index";
	}
	
	/** cxf调用 */
	@RequestMapping(value="/cxfList", method = RequestMethod.GET)
	public String cxfIndex(ModelMap model) throws MalformedURLException {
		String wsUserServiceUrl = "http://localhost:8080/web-demo/cxf/wsOrdersService?wsdl";
		URL url = new URL(wsUserServiceUrl);
		WsOrdersServiceImpl wsUserService = new WsOrdersServiceImpl(url);
		WsOrdersService wsOrdersService = wsUserService.getWsOrdersServiceImplPort();
		List<Orders> ordersList = wsOrdersService.findAllOrders();
		model.put("ordersList", ordersList);
		return "/cxfList";
	}
	
	/** Hessian调用 */
	@RequestMapping(value="/hsIndex", method = RequestMethod.GET)
	public String hsIndex(ModelMap model) throws MalformedURLException {
		List<com.tzz.web.domain.Orders> ordersList = hsOrdersService.findAllOrders();
		model.put("ordersList", ordersList);
		return "/hsIndex";
	}
}
