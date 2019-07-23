package com.michelfigueiredo.designpattern.creational.abstractfactory.gui.mac;

import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.Button;
import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.Checkbox;
import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.GUIFactory;

/**
 * @author mfigueiredo
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
