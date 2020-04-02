package com.sele.db.model;

import java.io.Serializable;

public class TStockCode implements Serializable {
    private String stockType;

    private String stockCode;

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