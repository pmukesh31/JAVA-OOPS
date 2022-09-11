public class StaticMethod {
    double x,y,r;
    public StaticMethod(int r){
        this.r=r;
    }
    public StaticMethod Bigger(StaticMethod s){
        if(s.r>r) return s;
        else return this;
    }
    public static StaticMethod Bigger(StaticMethod s1,StaticMethod s2)
    {
        if(s1.r>s2.r)
        return s1;
        else
        return s2;
    }
    public static void main(String []args) {
        StaticMethod obj1=new StaticMethod(9);
        StaticMethod obj2=new StaticMethod(3);
        StaticMethod obj3=obj1.Bigger(obj2);
        StaticMethod obj4=Bigger(obj1,obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        
    }
}
