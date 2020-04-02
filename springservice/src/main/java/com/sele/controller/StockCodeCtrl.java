package com.sele.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sele.config.RemoteConfig;
import com.sele.controller.vo.StockCodeV;
import com.sele.service.api.StockCodeIfc;
import com.sele.service.vo.StockCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/stock")
@Api(value="aaaaaaa")
@Log4j2
public class StockCodeCtrl extends RemoteConfig {


    @Autowired
    StockCodeIfc stockCodeSvc;
    
    @RequestMapping(value = "/get/{stockType}/{stockCode}",method = RequestMethod.GET)
    @ApiOperation(value="getStockCodeController",notes="stockType,stockCode", httpMethod = "GET")
    public List<StockCodeV> getStockCodeController(@PathVariable("stockType") String stockType, @PathVariable("stockCode") String stockCode) {
    	log.info("svc-getStockCodeController", stockType,stockCode);
    	log.info("RemoteConfig: " + this.value);
    	List<StockCode> list = stockCodeSvc.getStockCode(stockType, stockCode);
    	List<StockCodeV> listV = new ArrayList<StockCodeV>();
    	for (StockCode sc : list) {
    		StockCodeV stockCodeV =new StockCodeV();
			BeanUtils.copyProperties(sc, stockCodeV);
			listV.add(stockCodeV);
		}
    	return listV;
    }
        
}
