package cn.ctcc.springclouda11.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhangkui
 * @Date: 2018/7/13 15:35
 * @Description: 整个系统的全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionController implements ErrorController {

    /**
     * 拦截指定的异常，包括try..catch中抛出的的异常对象(我们常常需要对异常包装，抛出自己定义的异常)
     * 发生异常时,返回json类型的数据
     * @param e
     * @return
     */
   @RequestMapping("/error")
   @ExceptionHandler({Exception.class})
   @ResponseBody
   public Map<Integer,String> exceptionMessage(Exception e){

       e.printStackTrace();
       log.error(e.getMessage());

       Map<Integer, String> map = new HashMap<>();
       map.put(500,e.getMessage());
       return map;
   }


    @Override
    public String getErrorPath() {

        return "/error";
    }
}
