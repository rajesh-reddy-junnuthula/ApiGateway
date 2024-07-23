package com.ust.ProductService.repository;

import com.ust.ProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findProductsByMcode(Long mcode);
}
