package com.plume.mail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //网关开启服务注册发现
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MailGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailGatewayApplication.class, args);
	}

}
