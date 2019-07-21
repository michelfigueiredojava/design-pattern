package com.michelfigueiredo.designpattern.abstractfactory.theme.dark;

import com.michelfigueiredo.designpattern.abstractfactory.theme.Dialog;

/**
 * @author mfigueiredo
 */
public class DarkDialog implements Dialog {
    @Override
    public String draw() {
        return "dark_dialog";
    }
}
