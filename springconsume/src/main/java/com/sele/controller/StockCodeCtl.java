package com.sele.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sele.controller.vo.StockCodeRes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/stock")
@Api(value="aaaaaaa")
@Log4j2
public class StockCodeCtl {

	@Autowired
    RestTemplate restTemplate;
    
	@HystrixCommand(fallbackMethod = "getStockCodeXController")//断路器进入回路方法
    @RequestMapping(value = "/getback/{stockType}/{stockCode}",method = RequestMethod.GET)
    @ApiOperation(value="getStockCodeController",notes="stockType,stockCode", httpMethod = "GET")
    public List<StockCodeRes> getStockCodeController(@PathVariable("stockType") String stockType, @PathVariable("stockCode") String stockCode) {
    	log.info("con-getStockCodeController", stockType,stockCode);
    	List<StockCodeRes> listV = new ArrayList<StockCodeRes>();
    	//return listV;
    	return (List<StockCodeRes>)restTemplate.getForObject("http://eureka-client-service/stock/get/"+stockType+"/"+stockCode,List.class);
    }
	
	public List<StockCodeRes> getStockCodeXController(@PathVariable("stockType") String stockType, @PathVariable("stockCode") String stockCode) {
    	log.info("con-getStockCodeXController", stockType,stockCode);
    	List<StockCodeRes> listV = new ArrayList<StockCodeRes>();
    	//return listV;
    	return listV;
    }
        
}
