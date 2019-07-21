package com.michelfigueiredo.designpattern.abstractfactory.gui.mac;

import com.michelfigueiredo.designpattern.abstractfactory.gui.Button;
import com.michelfigueiredo.designpattern.abstractfactory.gui.Checkbox;
import com.michelfigueiredo.designpattern.abstractfactory.gui.GUIFactory;

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
