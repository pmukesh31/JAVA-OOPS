//Abstract class is used to what it can do but not how
//Object for Abstract class cannot be created
//can have abstract as well as non abstract methods
//sets a template
//Has no body
abstract class Sample{
    abstract void run();
    abstract void kick();
    
}
public class Abstract extends Sample{
    void run(){
        System.out.println("Sub classs of Abstract Class is created");
    }
    public static void main(String args[])
    {
        // Sample s=new Sample();
        // s.run();
        Abstract ab=new Abstract();
        ab.run();
        ab.kick();
    }
    
}
