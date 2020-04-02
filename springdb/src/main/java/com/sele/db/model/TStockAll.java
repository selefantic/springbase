package com.sele.db.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TStockAll implements Serializable {
    private Long id;

    private Integer partionkey;

    private String stateDt;

    private String stockCode;

    private Integer open;

    private Integer close;

    private Integer high;

    private Integer low;

    private Long vol;

    private BigDecimal amount;

    private Integer preClose;

    private BigDecimal amtChange;

    private BigDecimal pctChange;

    private Date reportTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPartionkey() {
        return partionkey;
    }

    public void setPartionkey(Integer partionkey) {
        this.partionkey = partionkey;
    }

    public String getStateDt() {
        return stateDt;
    }

    public void setStateDt(String stateDt) {
        this.stateDt = stateDt == null ? null : stateDt.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Integer getClose() {
        return close;
    }

    public void setClose(Integer close) {
        this.close = close;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Long getVol() {
        return vol;
    }

    public void setVol(Long vol) {
        this.vol = vol;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPreClose() {
        return preClose;
    }

    public void setPreClose(Integer preClose) {
        this.preClose = preClose;
    }

    public BigDecimal getAmtChange() {
        return amtChange;
    }

    public void setAmtChange(BigDecimal amtChange) {
        this.amtChange = amtChange;
    }

    public BigDecimal getPctChange() {
        return pctChange;
    }

    public void setPctChange(BigDecimal pctChange) {
        this.pctChange = pctChange;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}