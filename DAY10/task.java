class Locker{
    private boolean isLocked;
    private int pinCode;
    private String storedItem;
    Locker(int lockerId,int pin){
        this.pinCode = pin;
        isLocked = true;
    }
    public void storeItem(String item,int pin){
        if(pin == pinCode){
            if(!isLocked){
                storedItem = item;
                System.out.println("Item stored successfully");
            }
            else{
                System.out.println("Locker is locked. Unlock it first.");
            }
        }
        else{
            System.out.println("Invalid pin.");
        }
    }
    public void retrieveItem(int pin){
        if(pin == pinCode){
            if(!isLocked){
                System.out.println("Retrieved item: " + storedItem);
                storedItem = null;
            }
            else{
                System.out.println("Locker is locked. Unlock it first.");
            }
        }
        else{
            System.out.println("Invalid pin.");
        }

    }
    public void unlock(int pin){
        if(pin == pinCode){
            isLocked = false;
            System.out.println("Locker unlocked.");
        }
        else{
            System.out.println("Invalid pin.");
        }

    }
    public void lock(int pin){
        if(pin == pinCode){
            isLocked = true;
            System.out.println("Locker locked.");
        }
        else{
            System.out.println("Invalid pin.");
        }

    }
}

public class task{
    public static void main(String[] args){
        Locker locker = new Locker(101, 1234);
        locker.unlock(1234);
        locker.storeItem("Laptop", 1234);
        locker.retrieveItem(1234);
        locker.lock(1234);

    }
}