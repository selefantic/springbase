package com.sele.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;

import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
public class ConfigClass {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   // Do any additional configuration here
	   log.info("create RestTemplate");
	   return builder.build();
	}

    /**自定义配置ribbon负载均衡算法
     * @return
     */
    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();//轮询
        //return new RetryRule();//重试
        return new BestAvailableRule();
    }

}
