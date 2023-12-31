package com.gonzalomendozafullstack.products_service.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalomendozafullstack.products_service.model.dtos.ProductRequest;
import com.gonzalomendozafullstack.products_service.model.dtos.ProductResponse;
import com.gonzalomendozafullstack.products_service.services.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void addProduct(@RequestBody ProductRequest productRequest) {
		this.productService.addProduct(productRequest);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@PreAuthorize("hasRole('ROLE_USER')")
	public List<ProductResponse> getAllProducts() {
		return this.productService.getAllProducts();
		
	}

}
