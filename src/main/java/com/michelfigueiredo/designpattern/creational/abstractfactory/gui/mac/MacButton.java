package com.michelfigueiredo.designpattern.creational.abstractfactory.gui.mac;

import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.Button;

/**
 * @author mfigueiredo
 */
public class MacButton implements Button {
    @Override
    public String click() {
        return "MacButtonClicked";
    }
}
