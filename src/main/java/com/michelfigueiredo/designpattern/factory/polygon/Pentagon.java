package com.michelfigueiredo.designpattern.factory.polygon;

/**
 * @author mfigueiredo
 */
class Pentagon implements Polygon {
    @Override
    public PolygonType getType() {
        return PolygonType.PENTAGON;
    }
}
