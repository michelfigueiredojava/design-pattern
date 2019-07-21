package com.michelfigueiredo.designpattern.factory.transport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author mfigueiredo
 */
class TransportTest {

    TransportFactory transportFactory;
    @BeforeEach
    void setUp() {
        transportFactory = new TransportFactory();
    }

    @Test void
    can_get_a_car() {
        Transport transport = transportFactory.createTransport( 5 );
        assertThat( transport, instanceOf( Car.class ) );
    }

    @Test void
    can_get_a_van() {
        Transport transport = transportFactory.createTransport( 10 );
        assertThat( transport, instanceOf( Van.class ) );
    }
}
