package com.michelfigueiredo.designpattern.behavioural.strategy.payment;

/**
 * @author mfigueiredo
 */
public class DebitCardStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "payed by debit card: "+ amount;
    }
}
