class Static1{
    static int circlecount=0;
    double x,y,r;
    Static1(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
        circlecount++;
    }
    Static1(double radius)
    {
        // this(0.0,3.4,radius);
        circlecount++;
    }
    Static1()
    {
        // this(4.5,3.5,2);
        circlecount++;
    }
    public static void main(String[] args) {
        Static1 a=new Static1(5.0,2.0,3);
        Static1 b=new Static1(3);
        Static1 c=new Static1();
        System.out.println("Circle "+a.circlecount+" is created\n"+"Circle "+b.circlecount+" is created\n"+"Circle "+c.circlecount+" is created");

        
    }

}