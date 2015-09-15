package com.kjp.home.copier;

import com.google.inject.Inject;
import com.kjp.home.reader.IReader;
import com.kjp.home.writer.IWriter;

/**
 * Created by user on 14.09.2015.
 */
public class SimpleCopier implements ICopier {

    private IReader reader;
    private IWriter writer;

    @Inject
    public SimpleCopier(IReader reader, IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public void copy() {
        writer.write(reader.read());
    }
}
