package de.neuefische.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo(){
        products = new ArrayList<>();
    }

    public ProductRepo (List<Product> products){
        this.products = products;

    }

    public Product get(int id){
        for (Product product: products)
        { if(product.getId() == id) {
            return product;
        }

        }
        return null;
    }

    public List<Product> list(){
        return products;
    }
}
