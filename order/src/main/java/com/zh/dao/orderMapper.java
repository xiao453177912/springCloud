package com.zh.dao;

import com.zh.entiy.order;

public interface orderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(order record);

    int insertSelective(order record);

    order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}