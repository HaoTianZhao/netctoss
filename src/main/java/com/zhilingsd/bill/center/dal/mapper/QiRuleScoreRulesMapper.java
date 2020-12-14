package com.zhilingsd.bill.center.dal.mapper;

import com.zhilingsd.bill.center.dal.model.QiRuleScoreRules;
import com.zhilingsd.bill.center.dal.model.QiRuleScoreRulesExample;
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