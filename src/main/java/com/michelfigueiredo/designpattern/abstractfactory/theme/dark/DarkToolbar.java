package com.michelfigueiredo.designpattern.abstractfactory.theme.dark;

import com.michelfigueiredo.designpattern.abstractfactory.theme.Toolbar;

/**
 * @author mfigueiredo
 */
public class DarkToolbar implements Toolbar {
    @Override
    public String draw() {
        return "dark_toolbar";
    }
}
