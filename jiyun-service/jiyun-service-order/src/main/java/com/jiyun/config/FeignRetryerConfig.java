package com.jiyun.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignRetryerConfig {
    @Bean
    public Retryer retryer(){
        Retryer retryer=new Retryer.Default(100,1000,2);
        return  retryer;
    }
}
