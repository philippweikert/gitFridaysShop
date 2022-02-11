package de.neuefische.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo(){
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
}
