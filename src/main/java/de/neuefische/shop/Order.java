package de.neuefische.shop;

public class Order {

    private String products;
    private int id;

    public Order(String products, int id) {
        this.products = products;
        this.id = id;
    }

    public String getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "Order[ID: " + id + ", Product: " + products + "]";
    }
}

