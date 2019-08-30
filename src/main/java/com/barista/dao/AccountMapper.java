package com.barista.dao;

import com.barista.entity.Account;

import org.apache.ibatis.annotations.Param;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface AccountMapper {

    Account selectByPrimaryKey(Integer accountId);

    Account selectByIdcardNo(String accountRecommenderIdcardNo);

    int selectCount();

    List<Account> selectPaging(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);


    int selectCountFilter(@Param("accountIdcardNo") String accountIdcardNo, @Param("accountRealName") String accountRealName
            , @Param("accountLoginName") String accountLoginName, @Param("accountStatus") String accountStatus);


    List<Account> selectPagingFilter(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize
            , @Param("accountIdcardNo") String accountIdcardNo, @Param("accountRealName") String accountRealName
            , @Param("accountLoginName") String accountLoginName, @Param("accountStatus") String accountStatus);


    int insertSelective(Account record) throws SQLIntegrityConstraintViolationException;

    int startUsing(Integer accountId);

    int pauseUsing(Integer accountId);

    int deleteByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(Account record) throws SQLIntegrityConstraintViolationException;


}