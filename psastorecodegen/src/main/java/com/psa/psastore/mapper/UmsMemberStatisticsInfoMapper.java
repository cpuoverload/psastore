package com.psa.psastore.mapper;

import com.psa.psastore.model.UmsMemberStatisticsInfo;
import com.psa.psastore.model.UmsMemberStatisticsInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberStatisticsInfoMapper {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo row);

    int insertSelective(UmsMemberStatisticsInfo row);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberStatisticsInfo row, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("row") UmsMemberStatisticsInfo row, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo row);

    int updateByPrimaryKey(UmsMemberStatisticsInfo row);
}