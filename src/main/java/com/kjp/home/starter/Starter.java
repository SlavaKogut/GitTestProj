package com.kjp.home.starter;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kjp.home.config.Configuration;
import com.kjp.home.copier.ICopier;

/**
 * Created by user on 14.09.2015.
 */
public class Starter {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Configuration());
        ICopier service = injector.getInstance(ICopier.class);

        service.copy();
    }

}
