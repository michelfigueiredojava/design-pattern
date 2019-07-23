package com.michelfigueiredo.designpattern.behavioural.command.broker;

import lombok.AllArgsConstructor;

/**
 * Command
 * @author mfigueiredo
 */
@AllArgsConstructor
public class SellStock implements Order {
    private Stock stock;

    @Override
    public String execute() {
        return stock.sell();
    }
}
