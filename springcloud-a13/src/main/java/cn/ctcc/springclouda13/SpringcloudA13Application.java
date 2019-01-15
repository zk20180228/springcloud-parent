package cn.ctcc.springclouda13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudA13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA13Application.class, args);
	}

}

