package com.michelfigueiredo.designpattern.behavioural.command.broker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Invoker
 * @author mfigueiredo
 */
class Broker {

    private List<Order> orders = new LinkedList<>();

    void placeOrder(Order order) {
        orders.add( order );
    }

    String executeOrder() {
        Order remove = orders.remove(0);
        return remove.execute();
    }

    int getOrdersCount() {
        return orders.size();
    }
}
