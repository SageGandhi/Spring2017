package edu.gandhi.prajit.thymeleaf;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.LazyContextVariable;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import edu.gandhi.prajit.thymeleaf.pojo.Product;
import edu.gandhi.prajit.thymeleaf.pojo.UserDetails;
import edu.gandhi.prajit.thymeleaf.repo.ProductRepository;

public class InitializeTemplateEngine {
	
	public static void main(String[] args) {
		final FileTemplateResolver templateResolverFile = new FileTemplateResolver();
		templateResolverFile.setTemplateMode(TemplateMode.HTML);
		templateResolverFile.setPrefix("src/main/resources/templates/html/");
		templateResolverFile.setSuffix(".html");
		templateResolverFile.setCacheTTLMs(1 * 60 * 60 * 1000l);
		templateResolverFile.setCacheable(Boolean.TRUE);

		final TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(templateResolverFile);

		final Context context00 = new Context();
		
		final UserDetails userWelcome=UserDetails.builder().welcomeMsg("Learn ThymaLeaf In 15 Min.").name("Prajit").emailId("Prajit.Gandhi@gmail.com").admin(false).build();
		System.out.println("Welcome Messsage:"+userWelcome.getWelcomeMsg());
		final Map<String,List<UserDetails>> indexedExprMapList=new HashMap<>();
		indexedExprMapList.put("List",new ArrayList<>());
		indexedExprMapList.get("List").add(userWelcome);
		indexedExprMapList.get("List").add(UserDetails.builder().welcomeMsg("ThymeLeaf Welcomes Prajit").admin(true).build());
		indexedExprMapList.get("List").add(UserDetails.builder().welcomeMsg("ThymeLeaf Welcomes Swagat").admin(true).build());
		indexedExprMapList.get("List").add(UserDetails.builder().welcomeMsg("ThymeLeaf Welcomes Sraboni").admin(true).build());
		
		context00.setVariable("user",userWelcome);
		context00.setVariable("IndexedExpr",indexedExprMapList);
		context00.setVariable("RenderTime",Calendar.getInstance());
		final BufferedWriter writer00=new BufferedWriter(new OutputStreamWriter(System.out));
		templateEngine.process("Initiate",context00,writer00);

		final Context context01 = new Context();
		context01.setVariable("products",new LazyContextVariable<List<Product>>() {
			@Override
			protected List<Product> loadValue() {
				return ProductRepository.getInstance().findAll();
			}
		});
		final BufferedWriter writer01=new BufferedWriter(new OutputStreamWriter(System.out));
		templateEngine.process("Product",context01,writer01);
	}
}