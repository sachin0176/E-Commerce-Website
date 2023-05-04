package com.easy2shop.eccomerce.dao;

import com.easy2shop.eccomerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
