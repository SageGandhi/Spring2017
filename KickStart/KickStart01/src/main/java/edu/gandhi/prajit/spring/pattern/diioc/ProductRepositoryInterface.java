package edu.gandhi.prajit.spring.pattern.diioc;

import java.util.Arrays;
import java.util.List;

public interface ProductRepositoryInterface {

	default List<Product> findAll() {
		return Arrays.asList(Product.builder().name("No Product By Default").build());
	}

	default Product findById(Integer id) {
		return Product.builder().id(id).name("No Product By Default").build();
	}
}