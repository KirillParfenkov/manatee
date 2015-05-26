package by.parf.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by parf on 26.5.15.
 */
public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Test Bundle Activator start");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Test Bundle Activator stop");
    }
}
