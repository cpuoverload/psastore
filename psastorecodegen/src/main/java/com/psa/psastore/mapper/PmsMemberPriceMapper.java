package com.psa.psastore.mapper;

import com.psa.psastore.model.PmsMemberPrice;
import com.psa.psastore.model.PmsMemberPriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsMemberPriceMapper {
    long countByExample(PmsMemberPriceExample example);

    int deleteByExample(PmsMemberPriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice row);

    int insertSelective(PmsMemberPrice row);

    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsMemberPrice row, @Param("example") PmsMemberPriceExample example);

    int updateByExample(@Param("row") PmsMemberPrice row, @Param("example") PmsMemberPriceExample example);

    int updateByPrimaryKeySelective(PmsMemberPrice row);

    int updateByPrimaryKey(PmsMemberPrice row);
}