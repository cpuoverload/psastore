package com.psa.psastore.mapper;

import com.psa.psastore.model.SmsFlashPromotion;
import com.psa.psastore.model.SmsFlashPromotionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsFlashPromotionMapper {
    long countByExample(SmsFlashPromotionExample example);

    int deleteByExample(SmsFlashPromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion row);

    int insertSelective(SmsFlashPromotion row);

    List<SmsFlashPromotion> selectByExample(SmsFlashPromotionExample example);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsFlashPromotion row, @Param("example") SmsFlashPromotionExample example);

    int updateByExample(@Param("row") SmsFlashPromotion row, @Param("example") SmsFlashPromotionExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotion row);

    int updateByPrimaryKey(SmsFlashPromotion row);
}