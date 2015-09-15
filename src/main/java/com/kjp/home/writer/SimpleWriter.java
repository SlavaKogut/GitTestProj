package com.kjp.home.writer;

/**
 * Created by user on 14.09.2015.
 */
public class SimpleWriter implements IWriter {
    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
