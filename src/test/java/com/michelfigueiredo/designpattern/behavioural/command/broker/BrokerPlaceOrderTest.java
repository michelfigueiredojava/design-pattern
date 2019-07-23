package com.michelfigueiredo.designpattern.behavioural.command.broker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mfigueiredo
 */
class BrokerPlaceOrderTest {

    private Broker broker;
    private Stock stockWeg10, stockWeg11, stockWeg12, stockWeg13;

    @BeforeEach
    void setUp() {
        broker = new Broker();
        stockWeg10 = new Stock("WEG3", 10);
        stockWeg11 = new Stock("WEG3", 11);
        stockWeg12 = new Stock("WEG3", 12);
        stockWeg13 = new Stock("WEG3", 13);
    }

    @Test
    void can_place_buy_stock_order() {
        broker.placeOrder( new BuyStock(stockWeg10) );

        assertEquals( 1, broker.getOrdersCount() );
    }

    @Test
    void can_place_sell_stock_order() {
        broker.placeOrder( new SellStock(stockWeg11) );

        assertEquals( 1, broker.getOrdersCount() );
    }

    @Test
    void can_place_sell_and_buy_stock_order() {
        broker.placeOrder( new BuyStock(stockWeg12) );
        broker.placeOrder( new SellStock(stockWeg13) );

        assertEquals( 2, broker.getOrdersCount() );
    }
}
