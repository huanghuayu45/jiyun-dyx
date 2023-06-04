package com.jiyun.controller;

import com.jiyun.feign.GoodsFeign;
import com.jiyun.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private GoodsFeign goodsFeign;
    @GetMapping
    public Goods query(){
        return goodsFeign.findById(1);
    }
}
