interface I1{
    public static int i=10;
    void printInterface();
}
interface I2 implements I1{
    public static int j=100;
    public void printInterface(){
        System.out.println("Geeks");
    }
}//gives  error




    public  abstract class Demo2 {
        public int x=100;
        public abstract void exit();
    
}
interface I3 implements Demo2{
    public int k=10;
    void exit();
}
//interface cannot implement abstract class