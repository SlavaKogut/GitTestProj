package com.kjp.home.reader;

/**
 * Created by user on 14.09.2015.
 */
public class SimpleReader implements IReader {

    public static final String SIMPLE_STRING = "hello";

    @Override
    public String read() {
        return SIMPLE_STRING;
    }
}
