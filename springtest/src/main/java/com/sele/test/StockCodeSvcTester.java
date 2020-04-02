package com.sele.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.testng.annotations.Test;

import com.sele.service.api.StockCodeIfc;
import com.sele.service.vo.StockCode;

//@RunWith(value = SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = StockCodeIfc.class)
//@Import({FeignAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class})
//@EnableFeignClients(clients = StockCodeSvcTester.StockCodeIfcProxy.class)



@SpringBootTest(classes = StockCodeIfc.class)
@Import({FeignAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class})
@EnableFeignClients(clients = StockCodeSvcTester.StockCodeIfcProxy.class)
public class StockCodeSvcTester extends AbstractTestNGSpringContextTests {
	
	@FeignClient(value = "eureka-client-service")
	interface StockCodeIfcProxy extends StockCodeIfc{}
	
	@Autowired
	private StockCodeIfcProxy stockCodeIfcProxy;
	
	@Test
	public void getTest() {
		List<StockCode> list = stockCodeIfcProxy.getStockCode("sh", "000001");
		for (StockCode stockCode : list) {
			System.out.println(stockCode.getStockCode()+stockCode.getStockType()+":"+stockCode.getCount());
		}
	}

}
