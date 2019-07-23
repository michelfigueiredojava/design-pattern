package com.michelfigueiredo.designpattern.creational.abstractfactory.gui.mac;

import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.Checkbox;

/**
 * @author mfigueiredo
 */
public class MacCheckbox implements Checkbox {
    @Override
    public String check() {
        return "MacCheckboxChecked";
    }
}
