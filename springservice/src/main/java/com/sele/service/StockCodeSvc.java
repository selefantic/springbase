package com.sele.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sele.db.mapper.TStockCodeMapper;
import com.sele.db.model.TStockCode;
import com.sele.db.model.TStockCodeExample;
import com.sele.service.api.StockCodeIfc;
import com.sele.service.vo.StockCode;

@Service
public class StockCodeSvc implements StockCodeIfc{
	
	@Autowired
	private TStockCodeMapper tStockCodeMapper;

	@Override
	public List<StockCode> getStockCode(@PathVariable("stockType")String stockType, @PathVariable("stockCode")String stockCode) {
		TStockCodeExample tStockCodeExample = new TStockCodeExample();
		tStockCodeExample.createCriteria().andStockCodeEqualTo(stockCode).andStockTypeEqualTo(stockType);
		List<TStockCode> list = tStockCodeMapper.selectByExample(tStockCodeExample);
		List<StockCode> rtnlist = new ArrayList<StockCode>();
		for (TStockCode tStockCode : list) {
			StockCode sc = new StockCode();
			BeanUtils.copyProperties(tStockCode, sc);
			rtnlist.add(sc);
		}		
		return rtnlist;
	}

}
