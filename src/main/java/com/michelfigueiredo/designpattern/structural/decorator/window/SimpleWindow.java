package com.michelfigueiredo.designpattern.structural.decorator.window;

class SimpleWindow implements Window {
    @Override
    public void draw() {
        // Draw window
    }
    @Override
    public String getDescription() {
        return "simple window";
    }
}
