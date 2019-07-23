package com.michelfigueiredo.designpattern.creational.factory.polygon;

/**
 * @author mfigueiredo
 */
class Pentagon implements Polygon {
    @Override
    public PolygonType getType() {
        return PolygonType.PENTAGON;
    }
}
