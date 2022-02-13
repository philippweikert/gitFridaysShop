package de.neuefische.shop;

import java.util.Collection;
import java.util.HashMap;

public class OrderRepo {

    private HashMap<Integer, Order> orders;

    public OrderRepo(HashMap<Integer, Order> orders) {
        this.orders = orders;
    }

    public OrderRepo(){
        orders = new HashMap<>();
    }

    public Collection<Order> list(){
        return orders.values();

    }
    public Order get(Integer id){
        return orders.get(id);

    }

    public void add(Order orderNew){
        orders.put(orderNew.getId(), orderNew);
    }
}



