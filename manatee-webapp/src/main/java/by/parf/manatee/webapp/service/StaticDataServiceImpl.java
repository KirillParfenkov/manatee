package by.parf.manatee.webapp.service;

import org.apache.felix.ipojo.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

/**
 * Created by parf on 13.6.15.
 */
@Component(name="StaticDataService")
@Instantiate
public class StaticDataServiceImpl implements StaticDataService {

    @ServiceProperty(name="core application url")
    private String webappPathUrl = "/core-application";

    @ServiceProperty(name="core application url")
    private String webappPathSource = "/webapp";


    @Requires
    private HttpService httpService;

    public StaticDataServiceImpl() {

    }

    @Validate
    private void start() throws NamespaceException{
        httpService.registerResources(webappPathUrl, webappPathSource, null);
    }

    @Invalidate
    private void stop() {
        httpService.unregister(webappPathUrl);
    }
}