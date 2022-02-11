package de.neuefische.shop;

public class ShopService {

    private OrderRepo myOrders;
    private ProductRepo myProducts;

    public ShopService(){
        myOrders = new OrderRepo();
        myProducts= new ProductRepo();
    }

    public void getProduct(){
        return;
    }
}
