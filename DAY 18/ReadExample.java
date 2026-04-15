import java.io.*;
public class ReadExample {
    public static void main(String[] args){
        try{
            FileReader file=new FileReader("Test.txt");
            int character;
            while((character=file.read())!=-1){
                System.out.print((char)character);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
