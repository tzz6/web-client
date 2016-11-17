package com.tzz.designpattern.Decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test(){
		Decorator decorator = new Decorator(new Source());
		decorator.method();
	}
}
