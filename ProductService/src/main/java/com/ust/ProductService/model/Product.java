package com.ust.ProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Builder
@Table(name = "product")
public class Product {
    @Id
    public long id;
    public String productname;
    public String category;
    public double price;
    public String brand;
    public String quality;
    public String info;
    public String image;
    public int rating;
    public long mcode;




}
