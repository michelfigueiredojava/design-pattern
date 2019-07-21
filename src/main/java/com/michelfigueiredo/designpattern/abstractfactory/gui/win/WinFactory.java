package com.michelfigueiredo.designpattern.abstractfactory.gui.win;

import com.michelfigueiredo.designpattern.abstractfactory.gui.Button;
import com.michelfigueiredo.designpattern.abstractfactory.gui.Checkbox;
import com.michelfigueiredo.designpattern.abstractfactory.gui.GUIFactory;

/**
 * @author mfigueiredo
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
