class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ManualException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is lesser than 18");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(21);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
STORY OF THIS PROGRAM (CUSTOM EXCEPTION FLOW)

1. We create a custom exception class called InvalidAgeException.
   This class extends the built-in Exception class from the java.lang package.
   By extending Exception, our custom class gains all the capabilities of a standard Java exception
   such as storing error messages and providing methods like getMessage().

2. Since our custom class does not know how to store or manage messages,
   we use a constructor that takes a message as input and pass it to the parent (Exception class)
   using the super(msg) keyword. This allows the parent class to store the message properly.

3. We then create a method checkAge() which may lead to a risky situation (invalid age),
   so we declare it using 'throws InvalidAgeException'.
   This acts as a warning to the compiler and the caller that this method might throw an exception.

4. Inside the checkAge() method, we check the condition:
   if age < 18, we create an object of InvalidAgeException using 'new'.
   At this moment, the constructor runs and the message is stored in the parent Exception class.

5. Then we use the 'throw' keyword to send this exception object out of the method.
   This immediately stops normal execution and transfers control to the calling method.

6. In the main method, we use a try-catch block to handle this exception.
   When the exception is thrown, it is caught in the catch block.

7. The catch block receives the exception object (e),
   and we use e.getMessage() to retrieve and print the stored error message.

FINAL FLOW:
Condition fails → Exception object created → Constructor runs → Message stored →
throw sends object → catch receives object → message printed
*/