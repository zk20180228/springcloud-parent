package cn.ctcc.springclouda14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudA14Application {

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){

		return  new RestTemplate();
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA14Application.class, args);
	}

}

