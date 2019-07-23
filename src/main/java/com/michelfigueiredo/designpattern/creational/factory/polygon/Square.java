package com.michelfigueiredo.designpattern.creational.factory.polygon;

/**
 * @author mfigueiredo
 */
class Square implements Polygon {
    @Override
    public PolygonType getType() {
        return PolygonType.SQUARE;
    }
}
