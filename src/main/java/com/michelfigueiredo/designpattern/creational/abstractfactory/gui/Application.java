package com.michelfigueiredo.designpattern.creational.abstractfactory.gui;

/**
 * @author mfigueiredo
 */
public class Application {
    public static void main(String[] args) {
        if( args.length != 1 )throw new IllegalArgumentException("Pass Win or Mac");

        GUIFactory guiFactory = new FactoryProvider().create(args[0]);

        System.out.println( guiFactory.createButton().click() );
        System.out.println( guiFactory.createCheckbox().check() );

    }
}
