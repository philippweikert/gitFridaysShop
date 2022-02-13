package de.neuefische.shop;

import java.util.HashMap;
import java.util.Objects;

public class Order {

    private HashMap<String,Product> products;
    private Integer id;

    public Order (HashMap<String, Product> products){
        this.products = products;
    }

    public Integer getId(){
        return id;
    }

    public HashMap<String, Product> getProducts(){
        return products;
    }
}

