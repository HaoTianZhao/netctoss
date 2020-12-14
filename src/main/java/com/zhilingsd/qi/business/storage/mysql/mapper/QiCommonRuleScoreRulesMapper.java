package com.zhilingsd.qi.business.storage.mysql.mapper;

import com.zhilingsd.qi.business.storage.mysql.model.QiCommonRuleScoreRules;
import com.zhilingsd.qi.business.storage.mysql.model.QiCommonRuleScoreRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiCommonRuleScoreRulesMapper {
    int countByExample(QiCommonRuleScoreRulesExample example);

    int deleteByExample(QiCommonRuleScoreRulesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QiCommonRuleScoreRules record);

    int insertSelective(QiCommonRuleScoreRules record);

    List<QiCommonRuleScoreRules> selectByExample(QiCommonRuleScoreRulesExample example);

    QiCommonRuleScoreRules selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QiCommonRuleScoreRules record, @Param("example") QiCommonRuleScoreRulesExample example);

    int updateByExample(@Param("record") QiCommonRuleScoreRules record, @Param("example") QiCommonRuleScoreRulesExample example);

    int updateByPrimaryKeySelective(QiCommonRuleScoreRules record);

    int updateByPrimaryKey(QiCommonRuleScoreRules record);
}