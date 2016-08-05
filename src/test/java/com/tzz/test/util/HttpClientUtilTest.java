package com.tzz.test.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.tzz.util.HttpClientUtil;

public class HttpClientUtilTest {

	/**CMSP预审结果推送回SFBUY*/
	@Test
	public void cmspSendHttpPostSfbuy() {
		String xml = "<?xml version='1.0' encoding='UTF-8'?><ExamResult><orderId>2016072815031873137474577</orderId><status>1</status>"
				+ "<rmark>HKG 香港口岸</rmark></ExamResult>";
		System.out.println("content:" + xml);
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("content", xml);
		String responseContent = HttpClientUtil.getInstance().sendHttpPost("http://localhost:8080/sfbuy/examResult",
				maps);
		System.out.println("reponse content:" + responseContent);
	}
	
	@Test
	public void testSendHttpPost1() {
		String responseContent = HttpClientUtil.getInstance()
				.sendHttpPost("http://localhost:8080/web-demo/test/send?username=test01&password=123456");
		System.out.println("reponse content:" + responseContent);
	}

	@Test
	public void testSendHttpPost2() {
		String responseContent = HttpClientUtil.getInstance().sendHttpPost("http://localhost:8080/web-demo/test/send",
				"username=test01&password=123456");
		System.out.println("reponse content:" + responseContent);
	}

	@Test
	public void testSendHttpPost3() {
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("username", "test01");
		maps.put("password", "123456");
		String responseContent = HttpClientUtil.getInstance().sendHttpPost("http://localhost:8080/web-demo/test/send",
				maps);
		System.out.println("reponse content:" + responseContent);
	}

	@Test
	public void testSendHttpPost4() {
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("username", "test01");
		maps.put("password", "123456");
		List<File> fileLists = new ArrayList<File>();
		fileLists.add(new File("D://test//httpclient//1.png"));
		fileLists.add(new File("D://test//httpclient//1.txt"));
		String responseContent = HttpClientUtil.getInstance()
				.sendHttpPost("http://localhost:8080/web-demo/test/send/file", maps, fileLists);
		System.out.println("reponse content:" + responseContent);
	}

	@Test
	public void testSendHttpGet() {
		String responseContent = HttpClientUtil.getInstance()
				.sendHttpGet("http://localhost:8080/web-demo/test/send?username=test01&password=123456");
		System.out.println("reponse content:" + responseContent);
	}

	@Test
	public void testSendHttpsGet() {
		String responseContent = HttpClientUtil.getInstance().sendHttpsGet("https://www.baidu.com");
		System.out.println("reponse content:" + responseContent);
	}


	@Test
	public void testSendHttpPost6() {
		
		String content = "<logisticsEventsRequest>"+
	    "<logisticsEvent>"+
	    "<eventHeader>"+
	      "<eventType>TRADE_WAREHOUSE_ENTRY</eventType>"+
	      "<eventTime>订单入库时间</eventTime>"+
	      "<eventSource>集运商代号</eventSource>"+
	      "<eventTarget>TAOBAO</eventTarget>"+
	    "</eventHeader>"+
	    "<eventBody>"+  
	      "<tradeDetail>"+
	        "<tradeOrders>"+  
	          "<tradeOrder>"+
	            "<tradeOrderId>100002</tradeOrderId>"+
	      "<tradeRemarkCode>4个汉字的订单简短描述</tradeRemarkCode>"+
	           "<tradeRemark>订单详细描述</tradeRemark>"+
	          "</tradeOrder>"+
	        "</tradeOrders> "+ 
	      "</tradeDetail>"+
	      "<logisticsDetail>"+
	        "<feeType>类型0：普货 1:特货</feeType>"+
	        "<transferable>true</transferable>"+
	        "<combinable>true</combinable>"+
	        "<totalWeight>2.322</totalWeight>"+
	        "<adjustedFee></adjustedFee>"+
	      "</logisticsDetail>"+
	    "</eventBody>"+
	  "</logisticsEvent>"+
	"</logisticsEventsRequest>";
		
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("content", content);
//		String responseContent = HttpClientUtil.getInstance()
//				.sendHttpPost("http://10.118.71.63:8089/lscm/callback", "content="+content);
		String responseContent = HttpClientUtil.getInstance()
				.sendHttpPost("http://sfbuy-admin.sf-express.com/lscm/tm/callback", maps);

		System.out.println("reponse content:" + responseContent);
	}
	
	@Test
	public void testSendHttpGet2(){
		for (int i = 0; i < 20; i++) {
			try {
//				System.out.println("----------------" + i + "----------------");
				List<String> urls = new ArrayList<String>();
				urls.add("http://tzz6.iteye.com/blog/1775580");
				urls.add("http://tzz6.iteye.com/blog/1775585");
				urls.add("http://tzz6.iteye.com/blog/1775587");
				urls.add("http://tzz6.iteye.com/blog/1806639");
				urls.add("http://tzz6.iteye.com/blog/1831008");
				urls.add("http://tzz6.iteye.com/blog/1860612");
				urls.add("http://tzz6.iteye.com/blog/1906429");
				urls.add("http://tzz6.iteye.com/blog/1906432");
				urls.add("http://tzz6.iteye.com/blog/1909031");
				urls.add("http://tzz6.iteye.com/blog/1909043");
				urls.add("http://tzz6.iteye.com/blog/1915448");
				urls.add("http://tzz6.iteye.com/blog/1944849");
				urls.add("http://tzz6.iteye.com/blog/1988525");
				urls.add("http://tzz6.iteye.com/blog/2015767");
				urls.add("http://tzz6.iteye.com/blog/2038787");
				urls.add("http://tzz6.iteye.com/blog/2043646");
				urls.add("http://tzz6.iteye.com/blog/2077829");
				urls.add("http://tzz6.iteye.com/blog/2088955");
				urls.add("http://tzz6.iteye.com/blog/2104397");
				urls.add("http://tzz6.iteye.com/blog/2139478");
				urls.add("http://tzz6.iteye.com/blog/2139368");
				urls.add("http://tzz6.iteye.com/blog/2139483");
				urls.add("http://tzz6.iteye.com/blog/2139485");
				urls.add("http://tzz6.iteye.com/blog/2139487");
				urls.add("http://tzz6.iteye.com/blog/2164703");
				urls.add("http://tzz6.iteye.com/blog/2166022");
				urls.add("http://tzz6.iteye.com/blog/2166026");
				urls.add("http://tzz6.iteye.com/blog/2166070");
				urls.add("http://tzz6.iteye.com/blog/2175447");
				urls.add("http://tzz6.iteye.com/blog/2173788");
				urls.add("http://tzz6.iteye.com/blog/2172827");
				urls.add("http://tzz6.iteye.com/blog/2172826");
				urls.add("http://tzz6.iteye.com/blog/2172414");
				urls.add("http://tzz6.iteye.com/blog/2171239");
				urls.add("http://tzz6.iteye.com/blog/2169744");
				urls.add("http://tzz6.iteye.com/blog/2169736");
				urls.add("http://tzz6.iteye.com/blog/2166074");
				urls.add("http://tzz6.iteye.com/blog/2187207");
				urls.add("http://tzz6.iteye.com/blog/2187206");
				urls.add("http://tzz6.iteye.com/blog/2181770");
				urls.add("http://tzz6.iteye.com/blog/2181452");
				urls.add("http://tzz6.iteye.com/blog/2181346");
				urls.add("http://tzz6.iteye.com/blog/2180939");
				urls.add("http://tzz6.iteye.com/blog/2180938");
				urls.add("http://tzz6.iteye.com/blog/2176734");
				urls.add("http://tzz6.iteye.com/blog/2175875");
				urls.add("http://tzz6.iteye.com/blog/2175842");
				urls.add("http://tzz6.iteye.com/blog/2175811");
				urls.add("http://tzz6.iteye.com/blog/2175498");
				urls.add("http://tzz6.iteye.com/blog/2175474");
				urls.add("http://tzz6.iteye.com/blog/2175464");
				urls.add("http://tzz6.iteye.com/blog/2175454");
				urls.add("http://tzz6.iteye.com/blog/2205566");
				urls.add("http://tzz6.iteye.com/blog/2201306");
				urls.add("http://tzz6.iteye.com/blog/2201288");
				urls.add("http://tzz6.iteye.com/blog/2197416");
				urls.add("http://tzz6.iteye.com/blog/2196769");
				urls.add("http://tzz6.iteye.com/blog/2196742");
				urls.add("http://tzz6.iteye.com/blog/2196728");
				urls.add("http://tzz6.iteye.com/blog/2196074");
				urls.add("http://tzz6.iteye.com/blog/2195181");
				urls.add("http://tzz6.iteye.com/blog/2195078");
				urls.add("http://tzz6.iteye.com/blog/2194836");
				urls.add("http://tzz6.iteye.com/blog/2187634");
				urls.add("http://tzz6.iteye.com/blog/2187630");
				urls.add("http://tzz6.iteye.com/blog/2224981");
				urls.add("http://tzz6.iteye.com/blog/2224757");
				urls.add("http://tzz6.iteye.com/blog/2218323");
				urls.add("http://tzz6.iteye.com/blog/2218141");
				urls.add("http://tzz6.iteye.com/blog/2211048");
				urls.add("http://tzz6.iteye.com/blog/2211043");
				urls.add("http://tzz6.iteye.com/blog/2210480");
				urls.add("http://tzz6.iteye.com/blog/2205798");
				urls.add("http://tzz6.iteye.com/blog/2205769");
				urls.add("http://tzz6.iteye.com/blog/2205700");
				urls.add("http://tzz6.iteye.com/blog/2269441");
				urls.add("http://tzz6.iteye.com/blog/2269229");
				urls.add("http://tzz6.iteye.com/blog/2269214");
				urls.add("http://tzz6.iteye.com/blog/2212952");
				urls.add("http://tzz6.iteye.com/blog/2262983");
				urls.add("http://tzz6.iteye.com/blog/2262904");
				urls.add("http://tzz6.iteye.com/blog/2260750");
				urls.add("http://tzz6.iteye.com/blog/2259743");
				urls.add("http://tzz6.iteye.com/blog/2258149");
				urls.add("http://tzz6.iteye.com/blog/2256597");
				urls.add("http://tzz6.iteye.com/blog/2242758");
				urls.add("http://tzz6.iteye.com/blog/2232643");
				for (String url : urls) {
//					System.out.println(url);
//					Thread.sleep(1000*1);
					HttpClientUtil.getInstance().sendHttpGet(url);
				}
				System.out.println("--------------sleep(1000*60*10)--------------");
				Thread.sleep(1000*60*10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("success");
	}
	
	
	
}
