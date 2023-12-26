package com.gonzalomendozafullstack.products_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonzalomendozafullstack.products_service.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
