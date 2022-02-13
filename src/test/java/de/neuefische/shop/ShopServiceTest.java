package de.neuefische.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test

    public void shouldGetProductWork(){
        //given
        Product testProduct = new Product("Hose" ,123);
        List<Product> productList = new ArrayList<>();
        productList.add(testProduct);
        ProductRepo productRepo = new ProductRepo(productList);
        OrderRepo orderRepo = new OrderRepo();
        ShopService shopService = new ShopService(orderRepo, productRepo);

        //when
        Product result = shopService.getProduct(123);

        //then
        Assertions.assertEquals(result, shopService.getProduct(123));

    }

}