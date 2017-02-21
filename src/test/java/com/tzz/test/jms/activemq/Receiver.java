package com.tzz.test.jms.activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ActiveMQ测试--客户端（消息消费者）
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_activemq_client.xml")
public class Receiver {
	
	@Test
	public void testReceiver(){
		System.out.println("***************************");
		System.out.println("*********启动监听器*********");
		System.out.println("***************************");
	}
}
