package edu.gandhi.prajit.spring.core.ex02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.gandhi.prajit.spring.pattern.diioc.ProductRepository;
import edu.gandhi.prajit.spring.pattern.diioc.ProductRepositoryInterface;
import edu.gandhi.prajit.spring.pattern.diioc.ProductService;

@Configuration
@ComponentScan(basePackages={"edu.gandhi.prajit.spring.pattern.ex01","edu.gandhi.prajit.spring.core.ex02.service"})
/**Write Custom Filter For Component Scan Using {@link org.springframework.core.type.filter.TypeFilter}*/
public class AnnotationBasedConfiguration {
	@Bean ProductService productServiceViaSetter(){
		ProductService productService=new ProductService();
		productService.setProductRepository(productRepository());
		return productService;
	}
	@Bean ProductService productServiceViaConstructor(){
		return new ProductService(productRepository());
	}
	@Bean ProductRepositoryInterface productRepository() {
		return new ProductRepository();
	}
}
