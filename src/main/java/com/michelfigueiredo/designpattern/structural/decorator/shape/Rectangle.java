package com.michelfigueiredo.designpattern.structural.decorator.shape;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}
