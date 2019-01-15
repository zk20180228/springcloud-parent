package cn.ctcc.springclouda11.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zk
 * @Date: 2019/1/4 15:37
 * @Description:
 */
//@Component
public class MyZuulFilter02 extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {

        return 2;
    }

    @Override
    public boolean shouldFilter() {

        System.out.println("MyZuulFilter02-------------------------------->shouldFilter()");

        return RequestContext.getCurrentContext().sendZuulResponse();
    }

    @Override
    public Object run() throws ZuulException {

        System.out.println("MyZuulFilter01-------------------------------->run()");

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String token = request.getParameter("token");

//        if(token==null){
//
//            //设置不进行路由,即最终求情不会到达真正的服务端，但是当前还存在其他ZuulFilter,还会执行的，因此要设置shouldFilter方法
//            requestContext.setSendZuulResponse(false);
//
//            requestContext.setResponseStatusCode(401);
//            try {
//                requestContext.getResponse().getWriter().write("token is empty");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return null;
//        }


        return null;
    }
}
