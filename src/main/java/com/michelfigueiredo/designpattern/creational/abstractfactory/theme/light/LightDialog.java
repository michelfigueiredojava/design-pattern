package com.michelfigueiredo.designpattern.creational.abstractfactory.theme.light;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Dialog;

/**
 * @author mfigueiredo
 */
public class LightDialog implements Dialog {
    @Override
    public String draw() {
        return "light_dialog";
    }
}
