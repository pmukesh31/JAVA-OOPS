class Static{
    static int circlecount=0;
    double x,y,r;
    Static(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
        circlecount++;
    }
    Static(double radius)
    {
        this(0.0,3.4,radius);
        circlecount++;
    }
    Static()
    {
        this(4.5,3.5,2);
        circlecount++;
    }
    public static void main(String[] args) {
        Static a=new Static(5.0,2.0,3);
        Static b=new Static(3);
        Static c=new Static();
        System.out.println("Circle "+circlecount+" is created\n"+"Circle "+circlecount+" is created\n"+"Circle "+circlecount+" is created");

        
    }

}
