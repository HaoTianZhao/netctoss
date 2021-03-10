package com.zhilingsd.asset.data.center.dal.mapper;

import com.zhilingsd.asset.data.center.dal.model.DcBillInfo;
import com.zhilingsd.asset.data.center.dal.model.DcBillInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcBillInfoMapper {
    long countByExample(DcBillInfoExample example);

    int deleteByExample(DcBillInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DcBillInfo record);

    int insertSelective(DcBillInfo record);

    List<DcBillInfo> selectByExample(DcBillInfoExample example);

    DcBillInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DcBillInfo record, @Param("example") DcBillInfoExample example);

    int updateByExample(@Param("record") DcBillInfo record, @Param("example") DcBillInfoExample example);

    int updateByPrimaryKeySelective(DcBillInfo record);

    int updateByPrimaryKey(DcBillInfo record);
}