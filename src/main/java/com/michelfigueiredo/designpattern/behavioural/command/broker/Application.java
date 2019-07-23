package com.michelfigueiredo.designpattern.behavioural.command.broker;

/**
 * Client
 * @author mfigueiredo
 */
public class Application {
    public static void main(String[] args) {
        Stock stock = new Stock("AVA",12);

        Order buyStock = new BuyStock(stock);
        Order sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.placeOrder( buyStock );
        broker.placeOrder( sellStock );

        System.out.println( broker.executeOrder() );
        System.out.println( broker.executeOrder() );

    }
}
