package com.psa.psastore.mapper;

import com.psa.psastore.model.UmsMemberTag;
import com.psa.psastore.model.UmsMemberTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberTagMapper {
    long countByExample(UmsMemberTagExample example);

    int deleteByExample(UmsMemberTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag row);

    int insertSelective(UmsMemberTag row);

    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberTag row, @Param("example") UmsMemberTagExample example);

    int updateByExample(@Param("row") UmsMemberTag row, @Param("example") UmsMemberTagExample example);

    int updateByPrimaryKeySelective(UmsMemberTag row);

    int updateByPrimaryKey(UmsMemberTag row);
}