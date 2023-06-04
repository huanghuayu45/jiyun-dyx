package com.jiyun.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.bouncycastle.math.Primes;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template){
        System.out.println("FeignInterceptor被执行了!");
        template.header("myHeader","100");
    }
}
