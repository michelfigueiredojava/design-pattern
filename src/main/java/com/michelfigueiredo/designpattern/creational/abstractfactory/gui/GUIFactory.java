package com.michelfigueiredo.designpattern.creational.abstractfactory.gui;

/**
 * @author mfigueiredo
 */
public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
