package cn.ctcc.springclouda01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther: zhangkui
 * @desc:
 * @date: 2018/12/29 16:11
 *
 *	eureka是一个高可用的组件,注册中心
 *	@EnableEurekaServer:表明当前应用为：服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudA01Application{

	public static void main(String[] args) {

		SpringApplication.run(SpringcloudA01Application.class,args);

	}


}