package com.ecommerce.model;

public class Order {
    public User user;
    public Product product;
    public int quantity;
    public Order(User u,Product p,int qnty){
        this.user=u;
        this.product=p;
        this.quantity=qnty;
    }
}
