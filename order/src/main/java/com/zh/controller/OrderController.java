package com.zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zh.serverImpl.OrderServerImpl;
import com.zh.vo.SysResult;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderServerImpl orderServerImpl;
	
	@RequestMapping("/selectOrder")
	public SysResult selectOrder() {
		
		return SysResult.ok(orderServerImpl.selectOrder());
	}
}
