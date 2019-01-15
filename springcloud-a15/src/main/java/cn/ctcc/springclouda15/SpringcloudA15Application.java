package cn.ctcc.springclouda15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudA15Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA15Application.class, args);
	}

}

