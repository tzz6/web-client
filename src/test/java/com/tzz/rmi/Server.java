package com.tzz.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) {
		try {
			UserService userService = new UserServiceImpl();
			//注册通讯端口
			LocateRegistry.createRegistry(8080);
			//注册通讯路径
			Naming.rebind("rmi://127.0.0.1:8080/userService", userService);
			System.out.println("Service Start!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
