package edu.gandhi.prajit.spring.pattern.diioc;

public class Assembler {
	public static void main(String[] args) {
		//We Are Controlling This Instantiation,If Some "Thing" Provide This Dependency At Runtime
		//Control Is Inverted,LookUp & Instantiation Will Be Done By That "Thing",Call It Container 
		final ProductRepositoryInterface constructorDependency=new ProductRepository();
		final ProductService productService=new ProductService(constructorDependency);
		System.out.println(productService.getProductByName("Sweet"));
		
		//Dependency Provided By Default Implementation In Interface 
		productService.setProductRepository(new ProductRepositoryInterface(){});
		System.out.println(productService.getProductByName("Sweet"));
	}

}
