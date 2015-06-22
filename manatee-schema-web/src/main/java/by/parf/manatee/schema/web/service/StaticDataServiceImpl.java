package by.parf.manatee.schema.web.service;

import org.apache.felix.ipojo.annotations.*;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

/**
 * Created by parf on 22.6.15.
 */
@Component(name="manatee.schema.web.StaticDataService")
@Instantiate
public class StaticDataServiceImpl implements StaticDataService {

    @ServiceProperty(name="core application url")
    private String webAppUrl = "/manatee-schema-application";

    @ServiceProperty(name="core application url")
    private String webAppSource = "/webapp";


    @Requires
    private HttpService httpService;

    public StaticDataServiceImpl() {

    }

    @Validate
    private void start() throws NamespaceException {
        httpService.registerResources(webAppUrl, webAppSource, null);
    }

    @Invalidate
    private void stop() {
        httpService.unregister(webAppUrl);
    }
}
