package com.michelfigueiredo.designpattern.behavioural.command.broker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mfigueiredo
 */
class BrokerTakeOrderTest {

    private Broker broker;
    private Stock stockWeg10, stockWeg5;

    @BeforeEach
    void setUp() {
        broker = new Broker();
        stockWeg10 = new Stock("WEG3", 10);
        stockWeg5 = new Stock("WEG3", 5);
        broker.placeOrder( new BuyStock(stockWeg10) );
        broker.placeOrder( new SellStock(stockWeg5) );
    }

    @Test
    void can_take_order() {
        String response = broker.executeOrder();

        assertEquals("Buying stock order executed. Stock: WEG3 Quantity: 10", response);
        assertEquals( 1, broker.getOrdersCount() );
    }

    @Test
    void can_take_multiple_orders() {
        String response1 = broker.executeOrder();
        String response2 = broker.executeOrder();

        assertEquals("Buying stock order executed. Stock: WEG3 Quantity: 10", response1);
        assertEquals("Selling stock order executed. Stock: WEG3 Quantity: 5", response2);
        assertEquals( 0, broker.getOrdersCount() );
    }
}
