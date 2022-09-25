//Example that they are not synchronized
public class Demo3 extends Thread {
    public static int x;
    public void run(){
        for(int i=0;i<100;i++){
        x=x+1;
        x=x-1;
        }

    }
    public static void main(String args[]) {
        
        x=0;
        for(int i=0;i<2000;i++)
        {
            new Demo3().start();
            System.out.print(" "+x);//not always 0
        }
        
    }
    
}
