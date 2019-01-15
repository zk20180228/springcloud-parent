package cn.ctcc.springclouda11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudA11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA11Application.class, args);
	}

}

