package com.psa.psastore.portal.dao;

import com.psa.psastore.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单商品信息自定义Dao
 * Created by macro on 2018/9/3.
 */
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
