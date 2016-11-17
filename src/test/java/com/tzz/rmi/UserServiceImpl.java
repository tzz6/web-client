package com.tzz.rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
	
	public UserServiceImpl() throws RemoteException { 
		
    } 
 
	@Override
	public List<UserEntity> getList() throws RemoteException {
		List<UserEntity> list = new ArrayList<UserEntity>();
		UserEntity user1 = new UserEntity();
		user1.setId(1);
		user1.setName("t1");
		user1.setAge(27);
		UserEntity user2 = new UserEntity();
		user2.setId(2);
		user2.setName("t2");
		user2.setAge(27);
		list.add(user1);
		list.add(user2);
		return list;
	}

}
