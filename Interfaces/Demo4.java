interface I4{
    int i=10;
    void method1();
}
interface I5 {
    int j=20;
    void method2();

}


public class Demo4 implements I4,I5 {
    public void method1(){
        System.out.println("Method 1 ");
    }
    public void method2(){
        System.out.println("Method 2 ");
    }
    
    public static void main(String args[])
    {
        Demo4 dummy=new Demo4();
        dummy.method1();
        dummy.method2();

    }
    
}
