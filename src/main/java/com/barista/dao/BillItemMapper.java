package com.barista.dao;

import com.barista.entity.BillItem;

public interface BillItemMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(BillItem record);

    int insertSelective(BillItem record);

    BillItem selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(BillItem record);

    int updateByPrimaryKey(BillItem record);
}