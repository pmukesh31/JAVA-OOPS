interface I1{
    int i=10;
    void method1();
}
interface I2 extends I1{
    int j=20;
    void method2();

}
class A implements I2{
    public void method1(){
        System.out.println("Method 1 is implemented" + (i+j));
    }
    public void method2(){
        System.out.println("Method 2 is implemented" + (i+j));
    }
}
public class Demo3 extends A {
    public static void main(String args[])
    {
        Demo3 dem=new Demo3();
        dem.method1();
        dem.method2();
    }
    
}
