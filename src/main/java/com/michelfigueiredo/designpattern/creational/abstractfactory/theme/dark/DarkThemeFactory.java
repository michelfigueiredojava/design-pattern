package com.michelfigueiredo.designpattern.creational.abstractfactory.theme.dark;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Dialog;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Theme;
import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Toolbar;

/**
 * @author mfigueiredo
 */
public class DarkThemeFactory implements Theme {
    @Override
    public Toolbar getToolbar() {
        return new DarkToolbar();
    }

    @Override
    public Dialog getDialog() {
        return new DarkDialog();
    }
}
