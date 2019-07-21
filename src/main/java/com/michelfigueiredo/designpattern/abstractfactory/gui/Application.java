package com.michelfigueiredo.designpattern.abstractfactory.gui;

import com.michelfigueiredo.designpattern.abstractfactory.gui.mac.MacFactory;
import com.michelfigueiredo.designpattern.abstractfactory.gui.win.WinFactory;

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
