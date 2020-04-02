package com.sele.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TStockAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStockAllExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPartionkeyIsNull() {
            addCriterion("partionKey is null");
            return (Criteria) this;
        }

        public Criteria andPartionkeyIsNotNull() {
            addCriterion("partionKey is not null");
            return (Criteria) this;
        }

        public Criteria andPartionkeyEqualTo(Integer value) {
            addCriterion("partionKey =", value, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyNotEqualTo(Integer value) {
            addCriterion("partionKey <>", value, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyGreaterThan(Integer value) {
            addCriterion("partionKey >", value, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("partionKey >=", value, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyLessThan(Integer value) {
            addCriterion("partionKey <", value, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyLessThanOrEqualTo(Integer value) {
            addCriterion("partionKey <=", value, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyIn(List<Integer> values) {
            addCriterion("partionKey in", values, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyNotIn(List<Integer> values) {
            addCriterion("partionKey not in", values, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyBetween(Integer value1, Integer value2) {
            addCriterion("partionKey between", value1, value2, "partionkey");
            return (Criteria) this;
        }

        public Criteria andPartionkeyNotBetween(Integer value1, Integer value2) {
            addCriterion("partionKey not between", value1, value2, "partionkey");
            return (Criteria) this;
        }

        public Criteria andStateDtIsNull() {
            addCriterion("state_dt is null");
            return (Criteria) this;
        }

        public Criteria andStateDtIsNotNull() {
            addCriterion("state_dt is not null");
            return (Criteria) this;
        }

        public Criteria andStateDtEqualTo(String value) {
            addCriterion("state_dt =", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtNotEqualTo(String value) {
            addCriterion("state_dt <>", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtGreaterThan(String value) {
            addCriterion("state_dt >", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtGreaterThanOrEqualTo(String value) {
            addCriterion("state_dt >=", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtLessThan(String value) {
            addCriterion("state_dt <", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtLessThanOrEqualTo(String value) {
            addCriterion("state_dt <=", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtLike(String value) {
            addCriterion("state_dt like", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtNotLike(String value) {
            addCriterion("state_dt not like", value, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtIn(List<String> values) {
            addCriterion("state_dt in", values, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtNotIn(List<String> values) {
            addCriterion("state_dt not in", values, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtBetween(String value1, String value2) {
            addCriterion("state_dt between", value1, value2, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStateDtNotBetween(String value1, String value2) {
            addCriterion("state_dt not between", value1, value2, "stateDt");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Integer value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Integer value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Integer value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Integer value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Integer value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Integer> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Integer> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Integer value1, Integer value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Integer value) {
            addCriterion("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Integer value) {
            addCriterion("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Integer value) {
            addCriterion("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Integer value) {
            addCriterion("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Integer value) {
            addCriterion("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Integer> values) {
            addCriterion("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Integer> values) {
            addCriterion("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Integer value1, Integer value2) {
            addCriterion("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("close not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Integer value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Integer value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Integer value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Integer value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Integer value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Integer> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Integer> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Integer value1, Integer value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Integer value1, Integer value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(Integer value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(Integer value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(Integer value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(Integer value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(Integer value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(Integer value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<Integer> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<Integer> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(Integer value1, Integer value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(Integer value1, Integer value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andVolIsNull() {
            addCriterion("vol is null");
            return (Criteria) this;
        }

        public Criteria andVolIsNotNull() {
            addCriterion("vol is not null");
            return (Criteria) this;
        }

        public Criteria andVolEqualTo(Long value) {
            addCriterion("vol =", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotEqualTo(Long value) {
            addCriterion("vol <>", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolGreaterThan(Long value) {
            addCriterion("vol >", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolGreaterThanOrEqualTo(Long value) {
            addCriterion("vol >=", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLessThan(Long value) {
            addCriterion("vol <", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLessThanOrEqualTo(Long value) {
            addCriterion("vol <=", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolIn(List<Long> values) {
            addCriterion("vol in", values, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotIn(List<Long> values) {
            addCriterion("vol not in", values, "vol");
            return (Criteria) this;
        }

        public Criteria andVolBetween(Long value1, Long value2) {
            addCriterion("vol between", value1, value2, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotBetween(Long value1, Long value2) {
            addCriterion("vol not between", value1, value2, "vol");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPreCloseIsNull() {
            addCriterion("pre_close is null");
            return (Criteria) this;
        }

        public Criteria andPreCloseIsNotNull() {
            addCriterion("pre_close is not null");
            return (Criteria) this;
        }

        public Criteria andPreCloseEqualTo(Integer value) {
            addCriterion("pre_close =", value, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseNotEqualTo(Integer value) {
            addCriterion("pre_close <>", value, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseGreaterThan(Integer value) {
            addCriterion("pre_close >", value, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_close >=", value, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseLessThan(Integer value) {
            addCriterion("pre_close <", value, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseLessThanOrEqualTo(Integer value) {
            addCriterion("pre_close <=", value, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseIn(List<Integer> values) {
            addCriterion("pre_close in", values, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseNotIn(List<Integer> values) {
            addCriterion("pre_close not in", values, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseBetween(Integer value1, Integer value2) {
            addCriterion("pre_close between", value1, value2, "preClose");
            return (Criteria) this;
        }

        public Criteria andPreCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_close not between", value1, value2, "preClose");
            return (Criteria) this;
        }

        public Criteria andAmtChangeIsNull() {
            addCriterion("amt_change is null");
            return (Criteria) this;
        }

        public Criteria andAmtChangeIsNotNull() {
            addCriterion("amt_change is not null");
            return (Criteria) this;
        }

        public Criteria andAmtChangeEqualTo(BigDecimal value) {
            addCriterion("amt_change =", value, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeNotEqualTo(BigDecimal value) {
            addCriterion("amt_change <>", value, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeGreaterThan(BigDecimal value) {
            addCriterion("amt_change >", value, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amt_change >=", value, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeLessThan(BigDecimal value) {
            addCriterion("amt_change <", value, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amt_change <=", value, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeIn(List<BigDecimal> values) {
            addCriterion("amt_change in", values, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeNotIn(List<BigDecimal> values) {
            addCriterion("amt_change not in", values, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt_change between", value1, value2, "amtChange");
            return (Criteria) this;
        }

        public Criteria andAmtChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt_change not between", value1, value2, "amtChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeIsNull() {
            addCriterion("pct_change is null");
            return (Criteria) this;
        }

        public Criteria andPctChangeIsNotNull() {
            addCriterion("pct_change is not null");
            return (Criteria) this;
        }

        public Criteria andPctChangeEqualTo(BigDecimal value) {
            addCriterion("pct_change =", value, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeNotEqualTo(BigDecimal value) {
            addCriterion("pct_change <>", value, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeGreaterThan(BigDecimal value) {
            addCriterion("pct_change >", value, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pct_change >=", value, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeLessThan(BigDecimal value) {
            addCriterion("pct_change <", value, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pct_change <=", value, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeIn(List<BigDecimal> values) {
            addCriterion("pct_change in", values, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeNotIn(List<BigDecimal> values) {
            addCriterion("pct_change not in", values, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pct_change between", value1, value2, "pctChange");
            return (Criteria) this;
        }

        public Criteria andPctChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pct_change not between", value1, value2, "pctChange");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterionForJDBCDate("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterionForJDBCDate("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterionForJDBCDate("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}