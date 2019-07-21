package com.michelfigueiredo.designpattern.abstractfactory.gui.win;

import com.michelfigueiredo.designpattern.abstractfactory.gui.Checkbox;

/**
 * @author mfigueiredo
 */
public class WinCheckbox implements Checkbox {
    @Override
    public String check() {
        return "WinCheckboxChecked";
    }
}
