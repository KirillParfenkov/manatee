package by.parf.manatee.rest;

import org.apache.felix.ipojo.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by parf on 5.6.15.
 */
@Component(name="HelloKirylServlet")
@Instantiate
public class HelloKirylServlet extends HttpServlet {

    @ServiceProperty(name="alias")
    String alias = "/hellokiryl";

    @Requires
    private HttpService httpService;

    public HelloKirylServlet() {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello Kiryl!!");
    }

    @Validate
    public void start() throws ServletException, NamespaceException {
        System.out.println("HelloKirylServlet Start");
        httpService.registerServlet( alias, this, null, null );
    }

    @Invalidate
    public void stop() {
        System.out.println("HelloKirylServlet Stop");
        httpService.unregister(alias);
    }

}
