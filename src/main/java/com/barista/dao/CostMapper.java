package com.barista.dao;

import com.barista.entity.AdminInfo;
import com.barista.entity.Cost;

import org.apache.ibatis.annotations.Param;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface CostMapper {

    int selectCount();

    List<Cost> selectPaging(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);

    List<Cost> selectPagingOrder(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize, @Param("orderBy") String orderBy);

    int insertSelective(Cost record) throws SQLIntegrityConstraintViolationException;

    int startUsing(Integer costId);

    int deleteByPrimaryKey(Integer costId);

    int updateByPrimaryKeySelective(Cost record) throws SQLIntegrityConstraintViolationException;

    Cost selectByPrimaryKey(Integer costId);

    List<Cost> selectByExistField(Cost cost);


    //    int insert(Cost record);
    //    int updateByPrimaryKey(Cost record);
}