package com.sele.db.mapper;

import com.sele.db.model.TStockCode;
import com.sele.db.model.TStockCodeExample;
import java.util.List;

public interface TStockCodeMapper {
    int insert(TStockCode record);

    int insertSelective(TStockCode record);

    List<TStockCode> selectByExample(TStockCodeExample example);
}