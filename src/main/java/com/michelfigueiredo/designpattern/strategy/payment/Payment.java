package com.michelfigueiredo.designpattern.strategy.payment;

import lombok.AllArgsConstructor;

/**
 * @author mfigueiredo
 */
@AllArgsConstructor
public class Payment {
    private final PaymentStrategy paymentStrategy;

    public String pay(int value) {
        return paymentStrategy.pay( value );
    }
}
