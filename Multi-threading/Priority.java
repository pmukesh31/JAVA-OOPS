
class ThreadA1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread A with i = "+-1*i);
        }
        System.out.println("Exiting from Thread A");
    }
}
class ThreadB1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread B with i = "+i);
        }
        System.out.println("Exiting from Thread B");
    }
}
class ThreadC1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread C with i = "+2*i);
        }
        System.out.println("Exiting from Thread C");
    }
}

public class Priority {
    public static void main(String args[])
    {
        ThreadA1 a=new ThreadA1();
        ThreadB1 b=new ThreadB1();
        ThreadC1 c=new ThreadC1();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(b.getPriority()+1);
        a.setPriority(Thread.MIN_PRIORITY);
        
        c.start();
        b.start();
        a.start();
        System.out.println("Exiting from Main Thread");
    }
    
}
