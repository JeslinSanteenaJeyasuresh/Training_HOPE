class Bank{
    int bal=1000;
    synchronized void withdraw(int amt){
        if(amt<=bal){
            System.out.println("Amount withdraw is successfull");
            bal-=amt;
            System.out.println("Remaining amount"+bal);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class BankThread extends Thread{
    Bank b;
    BankThread(Bank b){
        this.b=b;
    }
    public void run(){
        b.withdraw(800);
    }
}
public class Synchronization {
    public static void main(String[] args){
        Bank b=new Bank();
        BankThread b1=new BankThread(b);
        BankThread b2=new BankThread(b);
        b1.start();
        b2.start();
    }
}
