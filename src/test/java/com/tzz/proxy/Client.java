package com.tzz.proxy;

import java.lang.reflect.Proxy;

public class Client{ 
  static public void main(String[] args) throws Throwable{
	  RealObject real = new RealObject();   
	  Subject proxySubject = (Subject)Proxy.newProxyInstance(real.getClass().getClassLoader(), 
	     real.getClass().getInterfaces(), 
	     new DynamicProxyObject(real));
	         
	  proxySubject.operation();
	  
	  System.out.println(proxySubject.add(2, 6));
  }
}
