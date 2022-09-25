// /*use of suspend() and yield()*/
// class D1 extends Thread{
//     public void run(){
//         try{
//             System.out.println("Thread D1 starts Executing");
//             sleep(10000);
//             System.out.println("Thread D1 went to sleep for 10 seconds and exited");
//         }
//         catch(Exception e){}
//     }
// }
// class D2 extends Thread{
//     public void run(){
//         try{
//             System.out.println("Thread D2 starts");
//             suspend();
//             System.out.println("Now  Resuming D2");

//         }
//     }
// }
// public class ControlMethods2
// {
//     public static void main(String args[])
//     {
//         D1 d1=new D1();
//         D2 d2=new D2();

//         d1.start();
//         d2.start();
//         System.out.println("Reviving D2 " );
//         d2.resume();
//         System.out.prinltn("Exiting Main Thread");
//     }
// }