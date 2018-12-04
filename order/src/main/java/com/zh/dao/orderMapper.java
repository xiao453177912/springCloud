package com.zh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.core.annotation.Order;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zh.entiy.order;

public interface orderMapper extends BaseMapper<Order>{
	
	@Select("select * from zh_order")
	public List<Order> selectOrder();
	
    int deleteByPrimaryKey(Integer orderId);

    int insert(order record);

    int insertSelective(order record);

    order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}