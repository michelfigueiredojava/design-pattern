package com.michelfigueiredo.designpattern.behavioural.command.broker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mfigueiredo
 */
class OrderTest {

    private Stock stockWeg10, stockWeg11, stockWeg12, stockWeg13;
    private Order order;
    private String response;

    @BeforeEach
    void setUp() {
        stockWeg10 = new Stock("WEG3", 10);
        stockWeg11 = new Stock("WEG3", 11);
        stockWeg12 = new Stock("WEG3", 12);
        stockWeg13 = new Stock("WEG3", 13);
    }

    @Test
    void car_execute_buy_stock_order_10_units() {
        order = new BuyStock(stockWeg10 );
        response = order.execute();
        assertEquals("Buying stock order executed. Stock: WEG3 Quantity: 10", response);
    }

    @Test
    void car_execute_buy_stock_order_11_units() {
        order = new BuyStock(stockWeg11 );
        response = order.execute();
        assertEquals("Buying stock order executed. Stock: WEG3 Quantity: 11", response);
    }

    @Test
    void car_execute_sell_stock_order_12_units() {
        order = new SellStock(stockWeg12 );
        response = order.execute();
        assertEquals("Selling stock order executed. Stock: WEG3 Quantity: 12", response);
    }

    @Test
    void car_execute_sell_stock_order_13_units() {
        order = new SellStock(stockWeg13);
        response = order.execute();
        assertEquals("Selling stock order executed. Stock: WEG3 Quantity: 13", response);
    }
}
