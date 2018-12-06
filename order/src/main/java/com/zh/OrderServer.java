package com.zh;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//@EnableEurekaClient
@MapperScan(basePackages="com.zh.dao")
public class OrderServer {

	public static void main(String[] args) {
		SpringApplication.run(OrderServer.class, args);
	}
}
