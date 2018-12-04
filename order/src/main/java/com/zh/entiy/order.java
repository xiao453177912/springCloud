package com.zh.entiy;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;

@TableName(value="zh_order")
@Data
public class order {
	@TableId(type=IdType.AUTO)
    private Integer orderId;

    private String orderNumber;

    private Date orderDate;

    private String orderPayStatus;

    private Integer orderPrice;

    
}