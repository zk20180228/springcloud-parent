package cn.ctcc.springclouda04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * EnableDiscoveryClient 和 EnableEurekaClient 关系
 * 相同点: 二者都是用来注册服务和发现服务的
 * 不同点：EnableEurekaClient专门为eureKa设计的，而EnableDiscoveryClient是支持多种注册中心的
 * spring cloud中discovery service有许多种实现（eureka、consul、zookeeper等等），
 * @EnableDiscoveryClient基于spring-cloud-commons,
 * @EnableEurekaClient基于spring-cloud-netflix。
 *	其实用更简单的话来说，就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，
 *	如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient
 */
//@EnableEurekaClient
@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
public class SpringcloudA04Application {

	//使用ribbon进行负载均衡-->常用的模式：ribbon+RestTemplate
	//默认：线性负载均衡策略(RoundRobinRule)，即轮询调用
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){

		return  new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA04Application.class, args);
	}

}

