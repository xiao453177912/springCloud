package com.zh.server;

import java.util.List;

import org.springframework.core.annotation.Order;

public interface OrderServer {
	public List<Order> selectOrder();
}
