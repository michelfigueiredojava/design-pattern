package com.michelfigueiredo.designpattern.creational.abstractfactory.theme;

/**
 * @author mfigueiredo
 */
public class Application {

    public static void main(String[] args) {
        if( args.length != 1 )throw new IllegalArgumentException("Pass Dark or Light");

        Theme theme = new FactoryProvider().create(args[0]);

        System.out.println( theme.getDialog().draw() );
        System.out.println( theme.getToolbar().draw() );
    }
}
