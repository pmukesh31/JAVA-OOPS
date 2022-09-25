class ThreadX implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread A with i = "+-1*i);
        }
        System.out.println("Exiting from Thread A");
    }
}
class ThreadY implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread B with i = "+i);
        }
        System.out.println("Exiting from Thread B");
    }
}
class ThreadZ implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread C with i = "+2*i);
        }
        System.out.println("Exiting from Thread C");
    }
}
public class Demo2 {
    public static void main(String sar[])
    {
        ThreadX a=new ThreadX();
        Thread t1=new Thread(a);
        ThreadY b=new ThreadY();
        Thread t2=new Thread(b);
        //ThreadZ c=new ThreadZ();
        Thread t3=new Thread(new ThreadZ());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Exiting from Main Thread");

    }
    
}
