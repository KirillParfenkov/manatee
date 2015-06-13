package by.parf.manatee.rest;

import org.apache.felix.ipojo.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;


/**
 * Created by parf on 5.6.15.
 */
@Component(name="TestApplication")
@Instantiate
public class TestApplicationImple implements TestApplication {

    @Requires
    private HttpService httpService;

    public TestApplicationImple() {

    }

    @Validate
    private void start() throws NamespaceException{
        httpService.registerResources("/webapp", "/webapp", null);
    }

    @Invalidate
    private void stop() {

    }

}
