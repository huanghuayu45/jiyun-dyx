package com.jiyun.controller;

import com.jiyun.mapper.GoodsMapper;
import com.jiyun.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsMapper goodsMapper;
    @GetMapping(value = "/{id}")
    public Goods findById(@PathVariable int id) throws InterruptedException{
        goodsMapper.selectById(id);
        return goodsMapper.selectById(id);
    }
}
