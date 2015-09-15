package com.kjp.home.config;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.kjp.home.copier.ICopier;
import com.kjp.home.copier.SimpleCopier;
import com.kjp.home.reader.IReader;
import com.kjp.home.reader.SimpleReader;
import com.kjp.home.writer.IWriter;
import com.kjp.home.writer.SimpleWriter;

/**
 * Created by user on 14.09.2015.
 */
public class Configuration extends AbstractModule {

    @Override
    protected void configure() {
        bind(IReader.class).to(SimpleReader.class).in(Scopes.SINGLETON);

        bind(IWriter.class).to(SimpleWriter.class).in(Scopes.SINGLETON);

        bind(ICopier.class).to(SimpleCopier.class).in(Scopes.SINGLETON);
    }

}
