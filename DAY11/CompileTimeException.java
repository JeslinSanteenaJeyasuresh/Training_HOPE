public class CompileTimeException {
    public static void main(String args[]){
        Thread T=new Thread(()->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(5000);
                System.out.println("thread wake");
            }
            catch(Exception e){
                System.out.println("Sleep interuppted");
            }
        });
        T.start();
        T.interrupt();
        try{
            Thread.sleep(4000);
        }
        catch(Exception e){
            System.out.println("Not T");
        }
    }
}
