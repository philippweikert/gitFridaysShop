package de.neuefische.shop;

import java.util.HashMap;

public class OrderRepo {

    private HashMap<String,Order> orders;

    public OrderRepo(){
        orders = new HashMap<>();
    }



    public HashMap<String, Order> getOrders() {
        return orders;
    }
}
