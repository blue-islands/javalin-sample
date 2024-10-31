package jp.livlog.javalin_thymeleaf;

import java.util.Map;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import io.javalin.rendering.FileRenderer;

public class ThymeleafRenderer implements FileRenderer {

    private final TemplateEngine templateEngine;

    public ThymeleafRenderer() {

        this.templateEngine = new TemplateEngine();
        final var resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        this.templateEngine.setTemplateResolver(resolver);
    }


    @SuppressWarnings ("unchecked")
    @Override
    public String render(final String filePath, final Map <String, ? extends Object> model, final io.javalin.http.Context ctx) {

        final var thymeleafContext = new Context();
        thymeleafContext.setVariables((Map <String, Object>) model);
        return this.templateEngine.process(filePath, thymeleafContext);
    }

}
