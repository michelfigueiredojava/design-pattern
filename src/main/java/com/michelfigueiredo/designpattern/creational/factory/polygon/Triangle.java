package com.michelfigueiredo.designpattern.creational.factory.polygon;

/**
 * @author mfigueiredo
 */
class Triangle implements Polygon {

    @Override
    public PolygonType getType() {
        return PolygonType.TRIANGLE;
    }
}
