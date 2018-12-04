package com.zh.serverImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.zh.dao.orderMapper;
import com.zh.server.OrderServer;

@Service
public class OrderServerImpl implements OrderServer {
	
	@Autowired
	private orderMapper orderMapper;

	@Override
	public List<Order> selectOrder() {
		return orderMapper.selectOrder();
	}
	
}
