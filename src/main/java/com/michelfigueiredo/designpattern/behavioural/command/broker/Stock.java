package com.michelfigueiredo.designpattern.behavioural.command.broker;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Receiver
 * @author mfigueiredo
 */
@Data
@AllArgsConstructor
class Stock {
	
   private String name;
   private int quantity;

   String buy(){
       return "Buying stock order executed. Stock: "+ name +" Quantity: "+ quantity;
   }
   String sell(){
       return "Selling stock order executed. Stock: "+ name +" Quantity: "+ quantity;
   }
}
