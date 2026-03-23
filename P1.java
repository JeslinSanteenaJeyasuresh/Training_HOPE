class Product{
    int id;
    String name;
    Double price;
    int quantity;
    Product(){}
    Product(int id,String name,Double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getTotalPrice(){
        return price*quantity;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("price:"+price);
        System.out.println("quantity:"+quantity);
    }
}
public class P1{
    public static void main(String args[]){
        Product p1=new Product(101, "laptop", 10001.31, 3);
        Product p2=new Product(102,"pendrive",120.31,2);
        Product p3=new Product(103,"charger",241.31,5);
        Product[] cart={p1,p2,p3};
        Double total=0.0;
        for(Product p:cart){
            p.display();
            System.out.println("--------------------------------------------------------------");
            total+=p.getTotalPrice();
        }
        System.out.print("Grand total bill:"+total);
    }
}