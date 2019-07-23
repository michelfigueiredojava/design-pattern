package com.michelfigueiredo.designpattern.creational.abstractfactory.gui;

import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.mac.MacFactory;
import com.michelfigueiredo.designpattern.creational.abstractfactory.gui.win.WinFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mfigueiredo
 */
class GUIFactoryTest {

    @Test
    void can_click_win_button() {
        GUIFactory guiFactory = new WinFactory();
        String click = guiFactory.createButton().click();

        assertEquals("WinButtonClicked", click);
    }

    @Test
    void can_click_mac_button() {
        GUIFactory guiFactory = new MacFactory();
        String click = guiFactory.createButton().click();

        assertEquals("MacButtonClicked", click);
    }

    @Test
    void can_check_win_checkbox() {
        GUIFactory guiFactory = new WinFactory();
        String check = guiFactory.createCheckbox().check();

        assertEquals("WinCheckboxChecked", check);
    }

    @Test
    void can_check_mac_checkbox() {
        GUIFactory guiFactory = new MacFactory();
        String check = guiFactory.createCheckbox().check();

        assertEquals("MacCheckboxChecked", check);
    }
}
