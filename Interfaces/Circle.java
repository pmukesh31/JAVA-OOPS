import Myinterface.*;
public class Circle  implements GeoAnalyser {
 float radius;
 Circle(float radius){
    this.radius=radius;
 }   
 public float area()
 {
    return pi*radius*radius;
 }
 public float perimeter(){
    return 2*pi*radius;
 }
}
