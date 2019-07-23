package com.michelfigueiredo.designpattern.creational.factory.polygon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author mfigueiredo
 */
class PolygonTest {

    PolygonFactory polygonFactory;

    @BeforeEach
    void setUp() {
        polygonFactory = new PolygonFactory();
    }

    @Test
    void
    can_create_pentagon() {
        Polygon polygon = polygonFactory.getPolygon(5);
        assertThat(polygon, instanceOf(Pentagon.class));
    }

    @Test
    void
    can_create_triangle() {
        Polygon polygon = polygonFactory.getPolygon(3);
        assertThat(polygon, instanceOf(Triangle.class));
    }

    @Test
    void
    can_create_square() {
        Polygon polygon = polygonFactory.getPolygon(4);
        assertThat(polygon, instanceOf(Square.class));
    }


}
