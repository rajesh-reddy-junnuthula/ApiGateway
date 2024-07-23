package com.ust.ProductService.service;


import com.ust.ProductService.dto.Productdto;
import com.ust.ProductService.model.Product;
import com.ust.ProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductRepository repo;

    public Product addProduct(Productdto product) {
        Product p1 = Product.builder()
                .id(product.getId())
                .productname(product.getProductname())
                .category(product.getCategory())
                .price(product.getPrice())
                .brand(product.getBrand())
                .quality(product.getQuality())
                .info(product.getInfo())
                .image(product.getImage())
                .rating(product.getRating())
                .mcode(product.getMcode())
        .build();
        return repo.save(p1);
    }

    public List<Product> getProductsByMcode(Long mcode) {
        return repo.findProductsByMcode(mcode);
    }
}
