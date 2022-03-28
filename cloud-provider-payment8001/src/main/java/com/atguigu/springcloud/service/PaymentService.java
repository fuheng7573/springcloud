package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;

public interface PaymentService {


    public int create(com.atguigu.springcloud.entities.Payment payment);

    public com.atguigu.springcloud.entities.Payment getPaymentById(@Param("id") Long id);
}


