package com.michelfigueiredo.designpattern.strategy.payment;

/**
 * @author mfigueiredo
 */
public class CheckStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "payed by check: "+ amount;
    }
}
