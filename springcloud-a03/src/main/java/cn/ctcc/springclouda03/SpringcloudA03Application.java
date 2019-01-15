package cn.ctcc.springclouda03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudA03Application{

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA03Application.class,args);
	}
}