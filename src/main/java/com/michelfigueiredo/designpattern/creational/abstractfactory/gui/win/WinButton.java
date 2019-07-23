package com.michelfigueiredo.designpattern.creational.abstractfactory.gui.win;

import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.Button;

/**
 * @author mfigueiredo
 */
public class WinButton implements Button {
    @Override
    public String click() {
        return "WinButtonClicked";
    }
}
