package com.michelfigueiredo.designpattern.structural.decorator.window;

abstract class WindowDecorator implements Window {
    private final Window windowToBeDecorated;

    public WindowDecorator (Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }
    @Override
    public void draw() {
        windowToBeDecorated.draw();
    }
    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription();
    }
}
