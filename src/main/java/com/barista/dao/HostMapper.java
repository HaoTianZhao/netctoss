package com.barista.dao;

import com.barista.entity.Host;

public interface HostMapper {
    int deleteByPrimaryKey(String hostId);

    int insert(Host record);

    int insertSelective(Host record);

    Host selectByPrimaryKey(String hostId);

    int updateByPrimaryKeySelective(Host record);

    int updateByPrimaryKey(Host record);
}