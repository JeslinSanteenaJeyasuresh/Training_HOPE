class character{ // base class
    String name; // common attribute
    String attack;
    public character(String name,String attack){    // constructor
        this.name = name; // current obj
        this.attack = attack;
    }
    public void display(){
        System.out.println("Name: "+name);// common method
        System.out.println("Attack: "+attack);
    }
}

class warrior extends character{ // derived class
    public warrior(String name,String attack){ // constructor
        super(name,attack);// call base class constructor
    }
    public void display(){// override method
        super.display();
        System.out.println("Class: Warrior");// additional info
    }
}// another derived class
class mage extends character{
    public mage(String name,String attack){
        super(name,attack);
    }
    public void display(){
        super.display();
        System.out.println("Class: Mage");
    }
}
class archer extends character{
    public archer(String name,String attack){
        super(name,attack);
    }
    public void display(){
        super.display();
        System.out.println("Class: Archer");
    }
}

public class game {
    public static void main(String[] args) {
        character c1 = new warrior("Aragorn", "Sword Strike"); // upcasting
        character c2 = new mage("Gandalf", "Fireball");
        character c3 = new archer("Legolas", "Steady Aim"       );

        c1.display();
        c2.display();
        c3.display();
    }
}