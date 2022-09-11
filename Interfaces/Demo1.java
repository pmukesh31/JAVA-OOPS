import Myinterface.*;
public class Demo1 implements firstInterface {

    //void run(){error because we need to declare it as public
    //     System.out.println("jjsrekl");
    // }
    public void run()
    {
        System.out.println("Run method is implemented ");
    }
    public static void main (String args[])
    {
        //firstInterface fi=new firstInterface();...error because instantiated
        firstInterface x;//allowed to declare;
        firstInterface []y=new firstInterface[3];//can create array of objects for interface is allowed; 
    }
    
}
