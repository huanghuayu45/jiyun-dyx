package com.jiyun.feign;

import com.jiyun.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// openfegin使用的是Http协议,通过name值jiyun-service可以找到商品服务的ip地址和端口
// 底层就是RestTemplete
@FeignClient(name = "jiyun-service-goods")
public interface GoodsFeign {
    @GetMapping(value = "/goods/{id}")
    public Goods findById(@PathVariable int id);
}
