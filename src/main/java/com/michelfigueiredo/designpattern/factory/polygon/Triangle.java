package com.michelfigueiredo.designpattern.factory.polygon;

/**
 * @author mfigueiredo
 */
class Triangle implements Polygon {

    @Override
    public PolygonType getType() {
        return PolygonType.TRIANGLE;
    }
}
