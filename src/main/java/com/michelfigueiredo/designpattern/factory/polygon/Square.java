package com.michelfigueiredo.designpattern.factory.polygon;

/**
 * @author mfigueiredo
 */
class Square implements Polygon {
    @Override
    public PolygonType getType() {
        return PolygonType.SQUARE;
    }
}
