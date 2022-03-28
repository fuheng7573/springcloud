package com.atguigu.springcloud.alibaba.myhandler;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.sun.deploy.security.BlockedException;

/**
 * @Author 付恒
 * @ClassName CustomerBlockHandler
 * @Date 2020/10/6
 * @Version 1.0
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockedException exception){
        return new CommonResult(4444,"按客戶自定义,global handlerException---1",new Payment(2020L,"serial003"));
    }
    public static CommonResult handlerException2(BlockedException exception){
        return new CommonResult(4444,"按客戶自定义,global handlerException---2",new Payment(2020L,"serial003"));
    }
}
