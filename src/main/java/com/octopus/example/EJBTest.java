package com.octopus.example;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
/**
 * An example of an EJB class
 */
@Singleton
@Startup
public class EJBTest {
    @PostConstruct
    public void onStart() {
        System.out.println("EJB has started!");
    }
}
