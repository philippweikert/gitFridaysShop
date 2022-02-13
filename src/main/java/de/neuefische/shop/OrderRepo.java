package de.neuefische.shop;

import java.util.HashMap;

public class OrderRepo {

    private HashMap<Integer ,Order> orders;

    public OrderRepo(){
        orders = new HashMap<>();
    }

    public HashMap<Integer, Order> getOrders() {
        return orders;
    }
}
