package com.michelfigueiredo.designpattern.creational.abstractfactory.gui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mfigueiredo
 */
class ApplicationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void can_run_win_mode() {
        Application.main(new String[]{"Win"});
        assertEquals("WinButtonClicked\nWinCheckboxChecked\n", outContent.toString());
    }


    @Test
    void can_run_mac_mode() {
        Application.main(new String[]{"Mac"});
        assertEquals("MacButtonClicked\nMacCheckboxChecked\n", outContent.toString());
    }
}
