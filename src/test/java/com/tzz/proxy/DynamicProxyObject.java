package com.tzz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyObject implements InvocationHandler{

	private Object sub;
	
	public DynamicProxyObject(Object sub) {
		this.sub = sub;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling " + method); 
		Object result = method.invoke(sub,args);
		return result;
	}

}
