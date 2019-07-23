package com.michelfigueiredo.designpattern.creational.abstractfactory.theme.dark;

import com.michelfigueiredo.designpattern.creational.abstractfactory.theme.Dialog;

/**
 * @author mfigueiredo
 */
public class DarkDialog implements Dialog {
    @Override
    public String draw() {
        return "dark_dialog";
    }
}
