class A{
    void msg1(){
        System.out.println("Public Method");
    }
    private void msg2(){
        System.out.println("Private Method");
    }
    protected void msg3(){
        System.out.println("Protected Method");
    }
}
public class Demo extends A{
    // protected void msg1(){
    //     System.out.println("Overrding private with public ");
    // }
    private void msg1(){
        System.out.println("Overrding protected with private ");
    }

    public static void main(String args[])
    {
        Demo obj=new Demo();
        obj.msg1();
    }
}
