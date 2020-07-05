package com.liyunlong.springdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@RefreshScope
@Component
public class SpringDemoNacosConfig {

	@Value("${config.name}")
	private String name;
	
	@Value("${config.text}")
	private String text;
	
}
