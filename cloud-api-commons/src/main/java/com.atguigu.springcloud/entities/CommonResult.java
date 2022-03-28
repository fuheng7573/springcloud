package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 付恒
 * @ClassName CommomResult
 * @Date 2020/9/28
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**404 not_found**/
    private Integer code;
    private String message;
    private T      data;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
