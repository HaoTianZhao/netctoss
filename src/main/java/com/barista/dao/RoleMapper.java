package com.barista.dao;

import com.barista.entity.Role;

import org.apache.ibatis.annotations.Param;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record) ;

    Role selectByPrimaryKey(Integer roleId);

    List<Role> selectByRoleIds(List<Integer> roleIds);

    Integer selectCount();

    List<Role> selectPaging(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);

    List<Role> selectAll();

    int updateByPrimaryKeySelective(Role record) ;

    int updateByPrimaryKey(Role record);
}