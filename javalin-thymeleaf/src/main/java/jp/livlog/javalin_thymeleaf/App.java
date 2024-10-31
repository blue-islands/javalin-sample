package jp.livlog.javalin_thymeleaf;

import java.util.Map;

import io.javalin.Javalin;

public class App {

    public static void main(final String[] args) {

        final var app = Javalin.create(config -> {
            config.fileRenderer(new ThymeleafRenderer()); // Thymeleafを使う
        }).start(7000);

        app.get("/", ctx -> {
            ctx.render("/index.html", Map.of("message", "Hello, Thymeleaf!"));
        });
    }
}
