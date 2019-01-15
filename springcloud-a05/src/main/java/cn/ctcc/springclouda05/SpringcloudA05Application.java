package cn.ctcc.springclouda05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudA05Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA05Application.class, args);
	}

}

