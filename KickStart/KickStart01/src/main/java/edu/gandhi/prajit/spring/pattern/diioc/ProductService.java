package edu.gandhi.prajit.spring.pattern.diioc;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
	private ProductRepositoryInterface productRepository;
	
	/**
	 * @return the productRepository
	 */
	public ProductRepositoryInterface getProductRepository() {
		return productRepository;
	}

	/**
	 * @param productRepository the productRepository to set
	 */
	public void setProductRepository(ProductRepositoryInterface productRepository) {//Setter Injection
		this.productRepository = productRepository;//Finder Object Coupled Here
	}

	/**
	 * @param productRepository
	 */
	public ProductService(ProductRepositoryInterface productRepository) {//Constructor Injection
		this.productRepository = productRepository;//Finder Object Coupled Here
	}	
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Product> getProductByName(final String name){
		//Finder Object Coupled Here
		//productRepository=new ProductRepository();
		return productRepository.findAll().stream()
			.filter(product->product.getName().contains(name))
			.collect(Collectors.toList());
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Product> getProductByNameUsingDefaultImplementation(final String name){
		return productRepository.findAll().stream()
			.filter(product->product.getName().contains(name))
			.collect(Collectors.toList());
	}
}
