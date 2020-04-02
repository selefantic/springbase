package com.sele.db.mapper;

import com.sele.db.model.TStockAll;
import com.sele.db.model.TStockAllExample;
import java.util.List;

public interface TStockAllMapper {
    int insert(TStockAll record);

    int insertSelective(TStockAll record);

    List<TStockAll> selectByExample(TStockAllExample example);
}