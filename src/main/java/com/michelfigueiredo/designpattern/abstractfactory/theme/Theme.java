package com.michelfigueiredo.designpattern.abstractfactory.theme;

/**
 * @author mfigueiredo
 */
public interface Theme {
    Toolbar getToolbar();
    Dialog getDialog();
}
