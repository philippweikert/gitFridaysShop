package de.neuefische.shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ShopService {

    private OrderRepo myOrders;
    private ProductRepo myProducts;

    public ShopService(OrderRepo orderRepo, ProductRepo productRepo){
        myOrders = new OrderRepo();
        myProducts= new ProductRepo();
    }

    public Product getProduct(int id) {
        return myProducts.get(id);

    }

    public List<Product> listProducts(){
        return myProducts.list();
    }

    public void addOrder(Order orders){
        myOrders.add(orders);
    }

    public OrderRepo getOrder(Integer id){
        return myOrders;
    }

    public Collection<Order> listOrders(){
        return myOrders.list();
    }
    }

