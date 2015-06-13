package by.parf.manatee.rest;

import org.apache.felix.ipojo.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import javax.servlet.ServletException;

/**
 * Created by parf on 3.6.15.
 */
//@Component(immediate = true)
//@Instantiate
//@Provides
public class RestComponentImpl implements RestComponent{

    @Requires
    private HttpService httpService;
    @Requires
    private HelloServlet helloServlet;

    @ServiceProperty(name="alias", value="/helloTest")
    private String alias;

    public RestComponentImpl() {
        System.out.println("Valideate: ");
        System.out.println("" + httpService);
        System.out.println("Loader httpService: ");
        System.out.println(httpService.getClass().getClassLoader().toString());
        System.out.println("Loader helloServlet: ");
        System.out.println(helloServlet.getClass().getClassLoader().toString());

        try {
            httpService.registerServlet(alias, helloServlet, null, null);
        } catch (ServletException e) {

        } catch (NamespaceException e) {

        }

    }

    @Validate
    public void start() throws NamespaceException, ServletException{
        System.out.println("RestComponentImpl Start -->");

        System.out.println("Valideate: ");
        System.out.println("" + httpService);
        System.out.println("Loader httpService: ");
        System.out.println(httpService.getClass().getClassLoader().toString());
        System.out.println("Loader helloServlet: ");
        System.out.println(helloServlet.getClass().getClassLoader().toString());

        //httpService.registerServlet(alias, helloServlet, null, null);

        /*RestResource res = new RestResource(myService);
        RestApplication app = new RestApplication(res);
        ServletContainer jerseyServlet = new ServletContainer(ResourceConfig.forApplication(app));

        System.out.println("httpService" + (httpService != null? "not null" : "null"));
        httpService.registerServlet("/jersey-ipojo", jerseyServlet, null, null);
        httpService.registerServlet("/hello", new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.getWriter().write("Hello World");
                super.doGet(req, resp);
            }
        }, null, null);
        System.out.println("RestComponentImpl Finish Start!");*/

    }

    @Invalidate
    public void stop() {
        System.out.println("RestComponentImpl Stop!");
    }

    public String getTEstSting() {
        return "Test";
    }
}
