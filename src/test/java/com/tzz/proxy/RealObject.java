package com.tzz.proxy;

public class RealObject implements Subject{

	@Override
	public void operation() {
		System.out.println("---operation---");
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}
