package com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Dialog;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Theme;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Toolbar;

/**
 * @author mfigueiredo
 */
public class LightThemeFactory implements Theme {
    @Override
    public Toolbar getToolbar() {
        return new LightToolbar();
    }

    @Override
    public Dialog getDialog() {
        return new LightDialog();
    }
}
