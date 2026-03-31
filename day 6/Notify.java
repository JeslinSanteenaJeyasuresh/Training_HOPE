class Notification {
    String name;
    String message;

    // Constructor
    Notification(String name, String message) {
        this.name = name;
        this.message = message;
    }

    void send() {
        System.out.println("Sending notification from parent class");
    }
}

// Email Notification
class EmailNotification extends Notification {
    EmailNotification(String name, String message) {
        super(name, message);
    }

    void send() {
        System.out.println("Sending email notification");
    }

    void changeReceiverEmail() {
        // optional method
    }
}

// SMS Notification
class SMSNotification extends Notification {
    SMSNotification(String name, String message) {
        super(name, message);
    }

    void send() {
        System.out.println("Sending SMS to " + name);
        System.out.println("Message: " + message);
    }
}

// Main Class
public class Notify {
    public static void main(String[] args) {

        Notification n;

        n = new EmailNotification("test", "Order confirmed");
        n.send();

        n = new SMSNotification("test2", "OTP is 234");
        n.send();
    }
}