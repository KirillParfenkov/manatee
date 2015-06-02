package by.parf.test;

import org.apache.felix.ipojo.annotations.*;

/**
 * Created by parf on 31.5.15.
 */
@Component
@Instantiate
@Provides
public class MyServiceImpl implements MyService {

    public String getDataToDisplay() {
        return null;
    }

    @Validate
    public void start() {
        System.out.println("Validate MyServiceImpl");
    }

    @Invalidate
    public void stop() {
        System.out.println("Invalidate MyServiceImpl");
    }
}