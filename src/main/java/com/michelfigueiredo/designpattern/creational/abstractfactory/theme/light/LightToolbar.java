package com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Toolbar;

/**
 * @author mfigueiredo
 */
public class LightToolbar implements Toolbar {
    @Override
    public String draw() {
        return "light_toolbar";
    }
}
