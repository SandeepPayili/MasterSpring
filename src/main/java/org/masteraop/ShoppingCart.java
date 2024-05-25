package org.masteraop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        System.out.println("SPXXX :: checkout method is called in ShoppingCart Class......");
    }
    public void greet(String name){
        System.out.println("SPXXX :: Warm Wishes :: "+name);
    }
}
