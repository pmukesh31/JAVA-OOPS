// /*use of yield(),start() and stop() */
// class ClassA extends Thread{
//     public void run(){
//         System.out.println("Start of Thread A");
//         for(int i=1;i<4;i++)
//         {
//             if(i==1)
//             yield();
//             System.out.println("From Thread A "+i);
//         }
//     }
// }
// class ClassB extends Thread{
//     public void run(){
//         System.out.println("Start of Thread B");
//         for(int i=1;i<4;i++)
//         {
//             if(i==2) 
//             stop();
//             System.out.println("From Thread B "+i);
//         }
//     }
// }
// class ClassC extends Thread{
//     public void run(){
//         System.out.println("Start of Thread C");
//         for(int i=1;i<4;i++)
//         {
//             if(i==3) 
//             {
//                 try{
//                     sleep(4000);
//                 }
//                 catch(Exception e){}
//             }
//             System.out.println("From Thread  C "+i);
//         }
//     }
// }


// public class ControlMethods {
//     public static void main(String argsp[])
//     {
//         ClassA a=new ClassA();
//         ClassB b=new ClassB();
//         ClassC c=new ClassC();
//         a.start();
//         b.start();
//         c.start();
// }
    
// }
