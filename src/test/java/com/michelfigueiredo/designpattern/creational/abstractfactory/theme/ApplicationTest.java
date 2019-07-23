package com.michelfigueiredo.designpattern.creational.abstractfactory.theme;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void can_run_dark_theme() {
        Application.main(new String[]{"Dark"});
        assertEquals("dark_dialog\ndark_toolbar\n", outContent.toString());
    }

    @Test
    void can_run_light_theme() {
        Application.main(new String[]{"Light"});
        assertEquals("light_dialog\nlight_toolbar\n", outContent.toString());
    }
}
