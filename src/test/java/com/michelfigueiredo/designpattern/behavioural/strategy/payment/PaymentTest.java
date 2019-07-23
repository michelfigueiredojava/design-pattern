package com.michelfigueiredo.designpattern.behavioural.strategy.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mfigueiredo
 */
public class PaymentTest {

    @Test
    void can_pay_by_debit_card() {
        PaymentStrategy paymentStrategy = new DebitCardStrategy();
        String message = paymentStrategy.pay( 10 );
        assertEquals("payed by debit card: 10", message);
    }

    @Test
    void can_pay_by_cash() {
        PaymentStrategy paymentStrategy = new CashStrategy();
        String message = paymentStrategy.pay( 11 );
        assertEquals("payed by cash: 11", message);
    }

    @Test
    void can_pay_by_check() {
        PaymentStrategy paymentStrategy = new CheckStrategy();
        String message = paymentStrategy.pay( 12 );
        assertEquals("payed by check: 12", message);
    }

    @Test
    void can_choose_payment_strategy_debit_card() {
        Payment payment = new Payment( new DebitCardStrategy() );
        String message = payment.pay( 13 );
        assertEquals("payed by debit card: 13", message);
    }

    @Test
    void can_choose_payment_strategy_cash() {
        Payment payment = new Payment( new CashStrategy() );
        String message = payment.pay( 14 );
        assertEquals("payed by cash: 14", message);
    }

    @Test
    void can_choose_payment_strategy_check() {
        Payment payment = new Payment( new CheckStrategy() );
        String message = payment.pay( 15 );
        assertEquals("payed by check: 15", message);
    }
}
