package jp.livlog.javalin_tomcat;

import java.util.function.Consumer;

import io.javalin.Javalin;
import io.javalin.config.JavalinConfig;

public class TomcatJavalin extends Javalin {

    public TomcatJavalin(final JavalinConfig config) {

        super(config);
    }


    public static TomcatJavalin create() {

        return TomcatJavalin.create(config -> {
        });
    }


    public static TomcatJavalin create(final Consumer <JavalinConfig> config) {

        final var cfg = new JavalinConfig();
        JavalinConfig.applyUserConfig(cfg, config); // mutates app.config and app (adds http-handlers)
        final var app = new TomcatJavalin(cfg);
        return app;
    }
}
