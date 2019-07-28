package com.michelfigueiredo.designpattern.structural.decorator.window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowDecoratorTest {

    @Test
    public void can_decorate_windows_with_vertical_and_horizontal_scrollbars() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        assertEquals("simple window, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
    }

    @Test
    public void can_decorate_windows_with_vertical_scrollbars() {
        Window decoratedWindow = new VerticalScrollBarDecorator(new SimpleWindow());
        assertEquals("simple window, including vertical scrollbars", decoratedWindow.getDescription());
    }

    @Test
    public void can_decorate_windows_with_horizontal_scrollbars() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new SimpleWindow());
        assertEquals("simple window, including horizontal scrollbars", decoratedWindow.getDescription());
    }

    @Test
    public void can_create_window_with_no_scrollbars() {
        Window simpleWindow = new SimpleWindow();
        assertEquals("simple window", simpleWindow.getDescription());
    }
}
