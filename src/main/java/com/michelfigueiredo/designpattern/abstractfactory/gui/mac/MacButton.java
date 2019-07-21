package com.michelfigueiredo.designpattern.abstractfactory.gui.mac;

import com.michelfigueiredo.designpattern.abstractfactory.gui.Button;

/**
 * @author mfigueiredo
 */
public class MacButton implements Button {
    @Override
    public String click() {
        return "MacButtonClicked";
    }
}
