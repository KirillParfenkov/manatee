package by.parf.core.modul;

import by.parf.test.MyService;
import org.apache.felix.ipojo.annotations.Requires;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by parf on 1.6.15.
 */
public class Activator implements BundleActivator {

    @Requires
    public MyService service;


    public void start(BundleContext bundleContext) throws Exception {
        System.out.println(service.getDataToDisplay());
    }

    public void stop(BundleContext bundleContext) throws Exception {

    }
}