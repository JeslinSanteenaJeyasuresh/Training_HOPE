import java.util.*;
class Product{
    String name;
    int price;
    double rating;
    Product(String n,int p,double r){
        this.name=n;
        this.price=p;
        this.rating=r;
    }
    @Override
    public String toString(){
        return name+":"+price+":"+rating;
    }
}
public class Task {
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Product("Laptop",120000,4.1));
        products.add(new Product("Mobile Phone",88000,2.5));
        products.add(new Product("Ear pods",1000,3.7));
        products.add(new Product("Key Pad",700,4.9));
        products.add(new Product("Laptop charger",2000,1.9));
        products.add(new Product("Speaker",20000,2.9));
        Comparator<Product> byprice=new Comparator<Product>(){
            public int compare(Product p1,Product p2){
                return p1.price-p2.price;
            }
        };
        Comparator<Product> byrating=new Comparator<Product>(){
            public int compare(Product p1,Product p2){
                return Double.compare(p1.rating,p2.rating);
            }
        };
        Comparator<Product> byname=new Comparator<Product>(){
            public int compare(Product p1,Product p2){
                return p1.name.compareTo(p2.name);
            }
        };
        Collections.sort(products,byrating);
        System.out.println(products);

    }
}
