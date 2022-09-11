public class NestedClass {
    static double x,y,r;
    NestedClass(double radius)
    {
        r=radius;
    }
    public static class Point{
        double x,y;
        void display(){
            System.out.println("(x,y) : ("+this.x+","+this.y+")");

        }
        Point(double a,double b){
            this.x=a;
            this.y=b;
        }
    }
    boolean InCircle(Point p)
    {
        double dx=p.x-x;
        double dy=p.y-y;
        double d=Math.sqrt((dx*dx)+(dy*dy));
        if(d<r)
        return true;
        else return false;
    }
    public static void main(String args[]) {
        NestedClass n=new NestedClass(4);
        Point p=new Point(3.0,4.0);
        p.display();
        System.out.println("If (3,2) is present in circle with radius 4 : "+n.InCircle(p));
        
    }
}
//Point class should be made static and cannot be accessed outside the class NestedClass
