package com.michelfigueiredo.designpattern.abstractfactory.gui.mac;

import com.michelfigueiredo.designpattern.abstractfactory.gui.Checkbox;

/**
 * @author mfigueiredo
 */
public class MacCheckbox implements Checkbox {
    @Override
    public String check() {
        return "MacCheckboxChecked";
    }
}
