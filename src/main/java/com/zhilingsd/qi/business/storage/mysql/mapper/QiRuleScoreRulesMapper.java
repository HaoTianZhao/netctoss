package com.zhilingsd.qi.business.storage.mysql.mapper;

import com.zhilingsd.qi.business.storage.mysql.model.QiRuleScoreRules;
import com.zhilingsd.qi.business.storage.mysql.model.QiRuleScoreRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiRuleScoreRulesMapper {
    int countByExample(QiRuleScoreRulesExample example);

    int deleteByExample(QiRuleScoreRulesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QiRuleScoreRules record);

    int insertSelective(QiRuleScoreRules record);

    List<QiRuleScoreRules> selectByExample(QiRuleScoreRulesExample example);

    QiRuleScoreRules selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QiRuleScoreRules record, @Param("example") QiRuleScoreRulesExample example);

    int updateByExample(@Param("record") QiRuleScoreRules record, @Param("example") QiRuleScoreRulesExample example);

    int updateByPrimaryKeySelective(QiRuleScoreRules record);

    int updateByPrimaryKey(QiRuleScoreRules record);
}