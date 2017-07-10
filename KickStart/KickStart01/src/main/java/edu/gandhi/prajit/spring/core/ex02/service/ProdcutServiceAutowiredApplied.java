package edu.gandhi.prajit.spring.core.ex02.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.gandhi.prajit.spring.pattern.diioc.Product;
import edu.gandhi.prajit.spring.pattern.diioc.ProductRepositoryInterface;

@Component("prodcutServiceAutowiredApplied")
public class ProdcutServiceAutowiredApplied {

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
	 * Auto Wired Applicable To One Constructor Only
	 */
	@Autowired
	public ProdcutServiceAutowiredApplied(ProductRepositoryInterface productRepository) {//Constructor Injection
		this.productRepository = productRepository;//Finder Object Coupled Here
	}	
	/**
	 * 
	 */
	public ProdcutServiceAutowiredApplied() {
		//Finder Object Coupled Into Setter
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
