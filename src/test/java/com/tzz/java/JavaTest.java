package com.tzz.java;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;

import org.junit.Test;

public class JavaTest {

	@Test
	public void test1() {
		System.out.println(
				"1\u00001\u00002007-08-28 00:52:10\u0000157556\u0000CAS\u0000BSP\u000010.0.22.33\u000010.0.13.38"
						+ "\u0000hq-it-230000.sf.com\u000000:15:C5:79:7E:F7\u0000013\u0000Success\u0000\u0000\r");
	}

	@Test
	public void test2() throws Exception {
		System.out.println("MAC ......... " + getMACAddress());
	}

	// 获取MAC地址的方法
	public static String getMACAddress() throws Exception {
		InetAddress ia = InetAddress.getLocalHost();// 获取本地IP对象
		// 获得网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中。
		byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();

		// 下面代码是把mac地址拼装成String
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < mac.length; i++) {
			if (i != 0) {
				sb.append("-");
			}
			// mac[i] & 0xFF 是为了把byte转化为正整数
			String s = Integer.toHexString(mac[i] & 0xFF);
			sb.append(s.length() == 1 ? 0 + s : s);
		}

		// 把字符串所有小写字母改为大写成为正规的mac地址并返回
		return sb.toString().toUpperCase();
	}
	
	@Test
	public void test3(){
		System.out.println((double)1236/10000);
	}

	@Test
	public void test4() {
		BigDecimal b1=new BigDecimal(Double.toString(261.40));  
        BigDecimal b2=new BigDecimal(Double.toString(100));  
		System.out.println(b1.multiply(b2).intValue());
	}
}
