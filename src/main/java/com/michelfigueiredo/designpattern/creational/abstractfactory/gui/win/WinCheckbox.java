package com.michelfigueiredo.designpattern.creational.abstractfactory.gui.win;

import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.Checkbox;

/**
 * @author mfigueiredo
 */
public class WinCheckbox implements Checkbox {
    @Override
    public String check() {
        return "WinCheckboxChecked";
    }
}
