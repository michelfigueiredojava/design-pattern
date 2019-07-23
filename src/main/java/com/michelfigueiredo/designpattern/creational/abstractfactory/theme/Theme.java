package com.michelfigueiredo.designpattern.creational.abstractfactory.theme;

/**
 * @author mfigueiredo
 */
public interface Theme {
    Toolbar getToolbar();
    Dialog getDialog();
}
