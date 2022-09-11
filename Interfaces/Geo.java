import Myinterface.*;
public class Geo {
    static void display(float x,float y)
    {
        System.out.println("Area ="+x+ "Perimeter ="+y);
    }
    public static void main(String args[])
    {
        // Circle c=new Circle(5.2f);
        // Ellipse e=new Ellipse(3.4f,5.6f);
        // GeoAnalyser geo;
        // geo=c;
        // display(geo.area(),geo.perimeter());
        // geo=e;
        // display(geo.area(),geo.perimeter());
        GeoAnalyser []geo=new GeoAnalyser[2];
        geo[0]=new Circle(5.2f);
        geo[1]=new Ellipse(3.4f,5.6f);
        float totalarea=0;
        for(int i=0;i<2;i++)
        {
            totalarea+=geo[i].area();
        }
        System.out.println("Total area of geo objecs is"+totalarea);
    }
    
}
