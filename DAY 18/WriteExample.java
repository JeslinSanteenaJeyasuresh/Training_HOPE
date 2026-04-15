import java.io.*;
public class WriteExample {
    public static void main(String[] args){
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Hi How are you!");
            writer.newLine();
            writer.write("How is life");
            writer.newLine();
            writer.write("Im Jeslin SJ");
            writer.newLine();
            writer.write("Im in HOPE NON_ELITE");
            writer.newLine();
            writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
