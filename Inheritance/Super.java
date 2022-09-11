// //JAVA SUPPORTS SINGLE INHERITANCE,MULTIPLE SINGLE INHERITANCE,SINGLE MULTILEVEL INHERITANCE
// //SUPER KEYWORD IS USED TO INVOKE IMMEDIATE PARENT CLASS MEMBERS,METHODS,CONSTRUCTORS
// class Animal{
//     String colour="Green";
//     Animal(){
//         System.out.println("Animal is created");
//     }
//     void eat(){
//         System.out.println("Animal is eating ......");
//     }

// }
// class Polar extends Animal{
//     String colour="White";
//     Polar(){
//         super();
//         System.out.println("Polar Bear is created");
//     }
//     void eat(){
//         System.out.println("Polar Bear is Eating......");
//     }
//     void hunt(){
//         System.out.println("Polar Bear is Hunting.....");
//     }
//     void work(){
//         super.eat();
//         hunt();
//         eat();
//     }
//     void display(){
//         System.out.println(colour);
//         System.out.println(super.colour);
//     }
// }
// public class Super {
//     public static  void main(String args[])
//     {
//         Polar p=new Polar();
//         p.display();
//         p.work();
//         Animal a=new Polar();//UP Casting for runtime polymorphism; no down casting can occur;
//         p.eat();
//     }
// }
// // class Point2D{
// //     double x,y;
// //     Point2D(){
// //         x=0.0;
// //         y=0.0;
// //     }
// //     Point2D(double x,double y){
// //         this.x=x;
// //         this.y=y;
// //     }
// // }
// // class Point3D extends Point2D{
// //     double z;
// //     Point3D(){
// //         super();
// //         z=7.0;
// //     }
// //     Point3D(double x,double y,double z){
// //         super(x,y);
// //         this.z=z;
// //     }
// // }
// // public class Super{
// //         public static void main(String args[]){
// //             Point3D p=new Point3D(3.0,4.0,7.0);
// //         }
// // }