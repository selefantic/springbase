package com.sele.service.api;

import java.util.List;

import com.sele.service.vo.StockCode;


public interface StockCodeIfc {


	public List<StockCode> getStockCode(String stockType,String stockCode);
	
}
