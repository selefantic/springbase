package com.sele.controller.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class StockCodeV implements Serializable {
	@ApiModelProperty(value="stockType")
    private String stockType;
	@ApiModelProperty(value="stockCode")
    private String stockCode;
	@ApiModelProperty(value="count")
    private Integer count;

    private static final long serialVersionUID = 1L;

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType == null ? null : stockType.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}