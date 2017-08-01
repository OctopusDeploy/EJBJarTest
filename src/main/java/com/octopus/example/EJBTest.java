package com.octopus.example;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * An example of an EJB class
 */
@Singleton
@Startup
public class EJBTest {
    private static final Logger LOGGER = Logger.getLogger(EJBTest.class.getName());

    @PostConstruct
    public void onStart() {
        LOGGER.log(Level.INFO, "EJB has started!");
    }
}
