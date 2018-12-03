package com.zh.dao;

import com.zh.entiy.orderDetails;

public interface orderDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(orderDetails record);

    int insertSelective(orderDetails record);

    orderDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(orderDetails record);

    int updateByPrimaryKeyWithBLOBs(orderDetails record);

    int updateByPrimaryKey(orderDetails record);
}