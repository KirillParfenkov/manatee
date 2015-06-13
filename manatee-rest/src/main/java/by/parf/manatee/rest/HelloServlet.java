package by.parf.manatee.rest;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.felix.ipojo.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by parf on 4.6.15.
 */
public class HelloServlet extends HttpServlet {

    @Requires
    private HttpService httpService;

    public HelloServlet() {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello World!");
    }

    @Validate
    public void start() throws ServletException, NamespaceException {
        /*System.out.println("Valideate: ");
        System.out.println("" + httpService);
        System.out.println("Loader 1: ");
        System.out.println(httpService.getClass().getClassLoader().toString());
        System.out.println("Loader 2: ");
        System.out.println(this.getClass().getClassLoader().toString());

        httpService.registerServlet(alias, this, null, null);*/
    }

    /*@Bind(id = "httpService")
    public void bindHttpService(HttpService httpService) throws ServletException, NamespaceException {
        System.out.println("Bind!!!!!!");
        System.out.println("Bind Http: " + (httpService == null));
        System.out.println("Bind Http: " + httpService);

        httpService.registerServlet(alias, this, null, null);
        System.out.println("Bind Http: " + httpService);
    }

    @Unbind(id = "httpService")
    public void unbindHttpService(HttpService service) {
        System.out.println("Unbind");
        service.unregister(alias);
    }*/
}
