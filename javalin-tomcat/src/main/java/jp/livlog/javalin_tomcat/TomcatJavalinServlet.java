package jp.livlog.javalin_tomcat;

import io.javalin.http.servlet.JavalinServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/api/*", name = "TomcatJavalinServlet")
public class TomcatJavalinServlet extends HttpServlet {

    private JavalinServlet javalinServlet;

    @Override
    public void init() {

        final var app = TomcatJavalin.create();
        app.get("/api/hello", ctx -> ctx.result("Hello from Javalin!"));
        this.javalinServlet = (JavalinServlet) app.javalinServlet();
    }


    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse resp) {

        try {
            this.javalinServlet.service(req, resp);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
