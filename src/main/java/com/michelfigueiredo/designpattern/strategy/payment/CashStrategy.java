package com.michelfigueiredo.designpattern.strategy.payment;

/**
 * @author mfigueiredo
 */
public class CashStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "payed by cash: "+ amount;
    }
}
