package com.michelfigueiredo.designpattern.abstractfactory.theme.light;

import com.michelfigueiredo.designpattern.abstractfactory.theme.Dialog;
import com.michelfigueiredo.designpattern.abstractfactory.theme.Theme;
import com.michelfigueiredo.designpattern.abstractfactory.theme.Toolbar;

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
