package com.michelfigueiredo.designpattern.abstractfactory.gui;

/**
 * @author mfigueiredo
 */
public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
