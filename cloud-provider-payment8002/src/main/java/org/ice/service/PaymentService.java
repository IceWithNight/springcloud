package org.ice.service;

import org.apache.ibatis.annotations.Param;
import org.ice.entities.Payment;

public interface PaymentService {

    //增
    public int create(Payment payment);

    //改     加上@Param注解，mapper中就可以采用#{}的方式把@Param注解括号内的参数进行引用
    public Payment getPaymentById(@Param("id") Long id);
}
