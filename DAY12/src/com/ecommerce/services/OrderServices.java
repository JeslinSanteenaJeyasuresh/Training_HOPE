package com.ecommerce.services;
import com.ecommerce.model.Order;
public class OrderServices {
    public void PlaceOrder(Order order){
        System.out.println("User Name:"+order.user.name);
        System.out.println("Product Name:"+order.product.name);
        System.out.println("Product Quantity:"+order.quantity);
        double TotalPrice=order.quantity*order.product.Price;
        System.out.println("Total price:"+TotalPrice);
    }
}
