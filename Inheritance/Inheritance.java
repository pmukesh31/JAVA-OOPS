class Box{
    double width;
    double height;
    double depth;
    Box(){

    }
    Box(double x,double y,double z){
        this.width=x;
        this.height=y;
        this.depth=z;
    
    }
    double volume(){
        return width*height*depth;
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(double w,double h,double d,double weight)
    {
        width=w;height=h;depth=d;this.weight=weight;
    }
}
public class Inheritance {
    public static void main(String args[])
    {
        Boxweight bw=new Boxweight(3,5,6,23);
        Box b=new Box();
        double volume=bw.volume();
        System.out.println("Volume of weightbox is "+ volume);
        System.out.println("Weight of weightbox is    "+bw.weight+"\n");
        b=bw;//Assign plainbox reference to boxweight
        volume=b.volume();
        System.out.println("Volume of box is "+volume);
        //Below is invalid
        // System.out.println("Weight of Box is "+b.weight);
    }
}












