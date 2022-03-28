package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 付恒
 * @ClassName PaymentDao
 * @Date 2020/9/28
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {
    public int create(com.atguigu.springcloud.entities.Payment payment);

    public com.atguigu.springcloud.entities.Payment getPaymentById(@Param("id") Long id);
}
