package com.jiyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

    @SpringBootApplication
    @EnableDiscoveryClient
    public class GoodsApplication9002 {
        public static  void main(String[] args){
            SpringApplication.run(GoodsApplication9002.class,args);
        }
    }

