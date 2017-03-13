package com.tzz.ws.restful.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import com.tzz.web.domain.Role;

/**
 * CXF restful风格测试类
 *
 */
public class WsUserInfoRestClient {
	 
    private static WebClient client;
    
    @Before
    public void init() {
        // 手动创建webClient对象，注意这里的地址是发布的那个/rest地址
        String url = "http://localhost:8080/web-demo/cxf/rest/";
        client = WebClient.create(url);
 
        // 从Spring Ioc容器中拿webClient对象
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-client.xml");
        //client = ctx.getBean("webClient", WebClient.class);
    }
    
    @Test
    public void testGet() {
        System.out.println(client.path("userRest").accept(MediaType.TEXT_PLAIN).get(String.class));
    }
    
    @Test
    public void testRequest() {
        System.out.println(client.path("userRest/request/234234").accept(MediaType.TEXT_PLAIN).get(String.class));
    }
    
    @Test
    public void testUser() {
        UserInfo user = client.path("userRest/getUser/{id}/{name}/{address}", 25, "test", "深圳").accept(MediaType.APPLICATION_XML).get(UserInfo.class);
        printUserInfo(user);
    }
	
    @Test
    public void testPostData() {
    	UserInfo user = buildUserInfo(1, "123", "深圳");
    	UserInfo userInfo = client.path("userRest/postData").accept(MediaType.APPLICATION_XML).post(user, UserInfo.class);
    	printUserInfo(userInfo);
    }
    
    @Test
    public void testPutData() {
    	UserInfo user = buildUserInfo(1, "12356", "深圳市南山区");
    	UserInfo userInfo = client.path("userRest/putData/1").accept(MediaType.APPLICATION_XML).put(user, UserInfo.class);
    	printUserInfo(userInfo);
    }
    
    @Test
    public void testDeleteData() {
        client.path("userRest/removeData/23").delete();
    }
    
    private UserInfo buildUserInfo(int id, String name, String address) {
		UserInfo user = new UserInfo();
		user.setId(id);
		user.setName(name);
		user.setAddress(address);
		List<Role> roles = new ArrayList<Role>();
		Map<String, Role> maps = new HashMap<String, Role>();
		for (int i = 0; i < 3; i++) {
			Role role = new Role();
			role.setId(Long.parseLong(i + ""));
			role.setName("role" + i);
			roles.add(role);
			maps.put("role" + i, role);
		}
		user.setRoles(roles);
		user.setMaps(maps);
		return user;
	}
    
    private void printUserInfo(UserInfo user) {
		System.out.println(user.getId()+"---"+user.getName()+"---"+user.getAddress());
        System.out.println("-----roles----");
        for(Role role : user.getRoles()){
        	System.out.println(role.getName());
        }
        System.out.println("-----maps----");
        for(Map.Entry<String, Role> map : user.getMaps().entrySet()){
        	System.out.println(map.getValue().getName());
        }
	}
    
    
}

