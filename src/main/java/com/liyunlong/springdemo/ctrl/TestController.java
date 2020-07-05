package com.liyunlong.springdemo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liyunlong.springdemo.config.SpringDemoNacosConfig;

@RestController
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private SpringDemoNacosConfig springDemoNacosConfig;
	
	@GetMapping("sayHello")
	public Object sayHello() {
		return springDemoNacosConfig.getName() + " say " + springDemoNacosConfig.getText();
	}
}
