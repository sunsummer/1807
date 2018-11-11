package cn.tedu.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 */
@FeignClient(value="provider-user1")
public interface EurekaServiceFeign {
	
	// 这个接口相当于把原来的服务提供者项目当成一个Service类
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
