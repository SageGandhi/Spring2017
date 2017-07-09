package edu.gandhi.prajit.thymeleaf;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Calendar;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.cache.StandardCacheManager;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;

public class HeaderBodyFooter {
	public static void main(String[] args) {
		final FileTemplateResolver templateResolverFile = new FileTemplateResolver();
		templateResolverFile.setTemplateMode(TemplateMode.HTML);
		templateResolverFile.setPrefix("src/main/resources/templates/html/");
		templateResolverFile.setSuffix(".html");
		templateResolverFile.setCacheTTLMs(1 * 60 * 60 * 1000l);
		templateResolverFile.setCacheable(Boolean.TRUE);
		templateResolverFile.setCharacterEncoding("UTF-8");
		templateResolverFile.setCheckExistence(true);

		StandardCacheManager standardCacheManager = new StandardCacheManager();
		standardCacheManager.setTemplateCacheMaxSize(100);
		standardCacheManager.clearAllCaches();

		final TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(templateResolverFile);
		templateEngine.setCacheManager(standardCacheManager);

		final Context context00 = new Context();
		context00.setVariable("RenderTime", Calendar.getInstance());
		context00.setVariable("UnEscape", "This Is <b>Bold</b> String.");
		final BufferedWriter writer00 = new BufferedWriter(new OutputStreamWriter(System.out));
		templateEngine.process("Body00", context00, writer00);
	}
}