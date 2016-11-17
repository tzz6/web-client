package com.tzz.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UserService extends Remote{

	public List<UserEntity> getList() throws RemoteException;
}
