package ct.cmcc.springclouda16.remoteconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: zk
 * @Date: 2019/1/6 14:28
 * @Description:
 */
@RequestMapping("remoteConfig")
@RestController
@RefreshScope//配合这个注解可以做到动态刷新配置
public class RemoteConfigCpntroller {

    //只有这样注入的值才会被动态刷新，通过Environment得到的配置数据，不会刷新
    @Value("${tomcat.port}")
    private String serverPort;

    //org.springframework.core.env.Environment
    @Resource
    private Environment environment;//不能做到动态更新数据


    @RequestMapping(value = "getValueByKey/{key}",method = RequestMethod.GET)
    public String getValueByKey(@PathVariable("key") String key) {

        return environment.getProperty(key);
    }


    @RequestMapping("getServerPort")
    public String getServerPort(){

        return serverPort;
    }


}
