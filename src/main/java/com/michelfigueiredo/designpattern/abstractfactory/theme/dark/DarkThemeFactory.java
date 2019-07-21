package com.michelfigueiredo.designpattern.abstractfactory.theme.dark;

import com.michelfigueiredo.designpattern.abstractfactory.theme.Dialog;
import com.michelfigueiredo.designpattern.abstractfactory.theme.Theme;
import com.michelfigueiredo.designpattern.abstractfactory.theme.Toolbar;

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
