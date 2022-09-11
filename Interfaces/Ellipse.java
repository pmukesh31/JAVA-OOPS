import Myinterface.*;
public class Ellipse  implements GeoAnalyser{
    float major;
    float minor;
    public Ellipse(float m,float k)
    {
        major=m;
        minor=k;
    }
    public float area(){
        return pi*major*minor;
    }
    public float perimeter(){
        return pi*(major+minor);
    }
}
