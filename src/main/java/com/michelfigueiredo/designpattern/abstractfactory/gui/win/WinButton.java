package com.michelfigueiredo.designpattern.abstractfactory.gui.win;

import com.michelfigueiredo.designpattern.abstractfactory.gui.Button;

/**
 * @author mfigueiredo
 */
public class WinButton implements Button {
    @Override
    public String click() {
        return "WinButtonClicked";
    }
}
