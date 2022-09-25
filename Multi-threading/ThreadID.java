class ID extends Thread{
    public void run()
    {
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running ");

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
public class ThreadID {
    public static void main(String gargs[])
    {
        for(int i=0;i<8;i++)
        {
            ID obj=new ID();
            obj.start();
        }
    }
    
}
