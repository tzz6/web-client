package com.tzz.rmi;

import java.rmi.Naming;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		try{
			//调用远程对象，注意RMI路径与接口必须与服务器配置一致
			UserService userService=(UserService)Naming.lookup("rmi://127.0.0.1:6600/PersonService");
			List<UserEntity> list = userService.getList();
			for(UserEntity user : list){
				System.out.println("ID:"+user.getId()+" Age:"+user.getAge()+" Name:"+user.getName());
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
