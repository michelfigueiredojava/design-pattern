package com.michelfigueiredo.designpattern.abstractfactory.gui;

import com.michelfigueiredo.designpattern.abstractfactory.gui.mac.MacFactory;
import com.michelfigueiredo.designpattern.abstractfactory.gui.win.WinFactory;

/**
 * @author mfigueiredo
 */
public class FactoryProvider {
    GUIFactory create(String operationSystem) {
        switch (operationSystem) {
            case "Win":
                return new WinFactory();
            case "Mac":
                return new MacFactory();
            default:
                throw new IllegalArgumentException();
        }
    }
}
