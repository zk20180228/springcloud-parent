package cn.ctcc.springclouda06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//@EnableCircuitBreaker
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudA06Application {

	//加了ribbon的包，就必须在RestTemplate上使用该注解，否则找会报UnknowHostNameException，找不到服务器的异常
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){

		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA06Application.class, args);
	}

}

