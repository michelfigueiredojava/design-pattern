package com.michelfigueiredo.designpattern.factory.polygon;

/**
 * @author mfigueiredo
 */
class PolygonFactory {

    Polygon getPolygon(int numberOfSides) {
        switch ( numberOfSides ){
            case 5: return new Pentagon();
            case 3: return new Triangle();
            case 4: return new Square();
        }
        return null;
    }
}
