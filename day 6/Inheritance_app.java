//import java.util.*;

class user{
    String name;
    String location;
    String number;

    user(String name,String location,String number){
        this.name = name;
        this.location = location;
        this.number = number;
    }
    void dislayinfo(){
        System.out.println("Name:"+name);
        System.out.println("Phn Number: "+number);
        System.out.println("Location: "+location);
    }
}

class rideuser extends user{
    String vehicletype; // vehicle type
    rideuser(String name,String location,String number,String vehicletype){
        super(name,location,number);// super
        this.vehicletype = vehicletype;
    }
    void displayinfo(){
        super.dislayinfo();
        System.out.println("Preferred Vehicle: "+vehicletype);
    }
}

class fooduser extends user{
    String favfood;
    fooduser(String name,String location,String number,String favfood){
        super(name,location,number);
        this.favfood = favfood;
    }
    void displayinfo(){
        super.dislayinfo();
        System.out.println("Fav Food: "+favfood);
    }
}

class parceluser extends user{
    double weight;
    parceluser(String name,String location,String number,double weight){
        super(name,location,number);
        this.weight = weight;
    }
    void displayinfo(){
        super.dislayinfo();
        System.out.println("Parcel Weight: "+weight+" kg");
    }
}
public class Inheritance_app{
    public static void main(String[]args){
        rideuser r = new rideuser("Dhanushri","Chn","98765432345678","thar");
        fooduser f = new fooduser("abi", "mumbai", "456789976542345", "vada pav");
        parceluser p = new parceluser("sri", "blr","726488876267",46.35);

        System.out.println("------------ RIDER DETAILS ------------");
        r.displayinfo();

        System.out.println("------------- FOOD DETAILS ------------");
        f.displayinfo();

        System.out.println("------------- PARCEL DETAILS -----------");
        p.displayinfo();
    }
}