class BankAccount{
    double balance; // private variable
    public void setBalance(double balance){     // setters 
        if(balance>0){
            this.balance = balance;
        }
        else{
            System.out.print("Input not valid");
        }
    }
    public void withdraw(int amount){
        if(amount > 0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount debited: "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount credited: "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public double getbalance(){ // getters
        return balance;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setBalance(1000);
        System.out.println("Balance: " + b.getbalance());

        b.withdraw(500);
        System.out.println("Balance: " + b.getbalance());

        b.deposit(9000);
        System.out.println("Balance: " + b.getbalance());
    }
}