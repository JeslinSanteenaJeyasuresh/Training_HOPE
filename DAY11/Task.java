import java.util.Random;
class OutOfStockException extends Exception{
    OutOfStockException(String msg){
        super(msg);
    }
}
class PaymentFailedException extends Exception{
    PaymentFailedException(String msg){
        super(msg);
    }
}
class OrderProcessingException extends Exception{
    OrderProcessingException(String msg){
        super(msg);
    }
}
class OrderServices{
    static void PlaceOrder(Order o) throws OutOfStockException,PaymentFailedException,OrderProcessingException{
        o.p.stock-=o.qnty;
        if(o.p.stock<0){
            throw new OutOfStockException("Out of stock!");
        }
        if(java.lang.Math.random()<0.4){
            throw new PaymentFailedException("Payment Failed!");
        }
        if(java.lang.Math.random()<0.2){
            throw new OrderProcessingException("Order Processing falied!");
        }
        System.out.println("Order is placed Successfully!");
    }
}
public class Task {
    public static void main(String[] args){
        Product p=new Product("mouse",5,200.25);
        User u=new User("test_1","Chennai");
        Order o=new Order(p,u,1);
        OrderServices s=new OrderServices();
        try{
            s.PlaceOrder(o);
        }
        catch(OutOfStockException e){
            System.out.print(e);
        }
        catch(PaymentFailedException e){
            System.out.print(e);
        }
        catch(OrderProcessingException e){
            System.out.print(e);
        }

    }
}

class Product{
    String name;
    int stock;
    double price;
    Product(String name,int Stock,double Price){
        this.name=name;
        this.stock=Stock;
        this.price=Price;
    }
}
class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Order{
    Product p;
    User u;
    int qnty;
    Order(Product p,User u,int qnty){
        this.p=p;
        this.u=u;
        this.qnty=qnty;
    }
}
