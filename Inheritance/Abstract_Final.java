// //Abstract class is used to what it can do but not how
// //Object for Abstract class cannot be created
// //can have abstract as well as non abstract methods
// //sets a template
// //Has no body
// abstract class Sample{
//     Sample(){
//         System.out.println("Sample class constructor is called");
//     }
//     abstract void run();
    
// }
// public class Abstract_Final extends Sample{
//     Abstract_Final(){
//         super();
//         System.out.println("Abstract class constructor is called");
//     }
//     void run(){
//         System.out.println("Sub classs of Abstract Class is created");
//     }
//     public static void main(String args[])
//     {
//         Abstract_Final ab=new Abstract_Final();
//         ab.run();
//         Sample s=new Abstract_Final();//we can create references of base type sample which is abstract class
//         s.run();
//     }
    
// }
// //Final keyword is used to restrict the use of methods,variables,class
// //If member is specified as final then it cannot be manipulated by subclass,method cannot be overriden,sub class cannot be created of final superclass
public class Abstract_Final{
    public static int i=7;
    public static void main(String args[]){
        Abstract_Final a=new Abstract_Final();
        Abstract_Final b=new Abstract_Final();
        a.i=3;
        b.i=2;
        System.out.println(a.i-b.i+Abstract_Final.i);
    }
}