package com.ecommerce.main;
import com.ecommerce.model.*;
import com.ecommerce.services.OrderServices;
public class Main {
    public static void main(String[] args){
        User user=new User("Sid","Avadi");
        Product product=new Product("EarPhones",500);
        Order order=new Order(user,product,2);
        OrderServices OS=new OrderServices();
        OS.PlaceOrder(order);

    }
}
