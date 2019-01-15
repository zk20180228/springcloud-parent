package cn.ctcc.springclouda11.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zk
 * @Date: 2019/1/4 14:38
 * @Description:
 *
 * zuul的过滤器:zuul不仅只是路由，并且还能过滤，做一些安全验证
 *
 */
//@Component
public class MyZuulFilter01 extends ZuulFilter {

    /**
        filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
        pre：路由之前
        routing：路由之时
        post： 路由之后
        error：发送错误调用
    */
    @Override
    public String filterType() {

        return "pre";//路由之前
    }

    /**
     * 过滤的顺序
     *  则筛选器可以具有相同的筛选器顺序
     */
    @Override
    public int filterOrder() {

        return 1;//过滤的顺序
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     *
     */
    @Override
    public boolean shouldFilter() {

        System.out.println("MyZuulFilter01-------------------------------->shouldFilter()");

        return RequestContext.getCurrentContext().sendZuulResponse();//判断该路由是否继续进行
    }


    /**
     * @auther: zhangkui
     * @desc:   过滤器的具体逻辑。可以很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     * @date: 2019/1/4 14:42
     * @param:
     * @return: 源码中这样说：可能会返回一些任意的值。当前实现忽略它。
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("MyZuulFilter01-------------------------------->run()");

        //zuul提供的RequestContext
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        System.out.println("Method=:"+request.getMethod());
        System.out.println("Url=:"+request.getRequestURL());



        return request;
    }
}
