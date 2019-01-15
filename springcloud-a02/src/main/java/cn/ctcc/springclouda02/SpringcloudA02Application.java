package cn.ctcc.springclouda02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther: zhangkui
 * @desc:
 * @date: 2018/12/29 17:33
 *
 *
 * EnableEurekaClient:向注册中心注册服务
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudA02Application{

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudA02Application.class,args);
	}

}

