class SampleThreadExmaple extends Thread{
    @Override()
    public void run(){
        System.out.println("Thread running using Thread class");
    }
}

class SampleThreadExmaple1 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Thread running using Runnable");
            Thread.sleep(4000);
            System.out.println("After 4 seconds");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class ThreadRExample{
    public static void main(String[] args){
        SampleThreadExmaple s=new SampleThreadExmaple();
        s.run();
        //Thread th=new Thread(new SampleThreadExmaple1());
                              //or
        SampleThreadExmaple1 sb=new SampleThreadExmaple1();
        Thread th=new Thread(sb);
        th.start();
    }
}