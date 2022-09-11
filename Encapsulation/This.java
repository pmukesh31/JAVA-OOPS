class A{
    A(){
        this(5);
        System.out.println("This is default A Constructor");
    }
    A(int x){
        System.out.println("This is the value of x "+x);
    }
    void m(){
        System.out.println("This is method m");
    }
    void n(){
        System.out.println("This is method n");
        this.m();
    }
}
public class This {
    public  static void main(String xoxo[]){
        A A=new A();
        A.m();
        A.n();
        

    }
}
