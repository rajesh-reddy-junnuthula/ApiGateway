package com.ust.M_service.feign;

import com.ust.M_service.client.Fullresponse;
import com.ust.M_service.client.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ProductService", url="localhost:9098/product")
public interface ProductClient {

    @GetMapping("/company/{mcode}")
    List<Product> findProductsByMcode(@PathVariable("mcode") long mcode);
}
