package com.barista.dao;

import com.barista.entity.ServiceUpdate;

public interface ServiceUpdateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceUpdate record);

    int insertSelective(ServiceUpdate record);

    ServiceUpdate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceUpdate record);

    int updateByPrimaryKey(ServiceUpdate record);
}