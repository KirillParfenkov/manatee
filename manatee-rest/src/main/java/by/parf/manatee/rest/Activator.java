package by.parf.manatee.rest;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
/**
 * Created by parf on 5.6.15.
 */

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("Rest Activator start!");

    }

    public void stop(BundleContext context) throws Exception {

    }
}
