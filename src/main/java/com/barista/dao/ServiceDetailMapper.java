package com.barista.dao;

import com.barista.entity.ServiceDetail;

public interface ServiceDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceDetail record);

    int insertSelective(ServiceDetail record);

    ServiceDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceDetail record);

    int updateByPrimaryKey(ServiceDetail record);
}