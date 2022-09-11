import java.util.ArrayList;
import java.util.Scanner;
public class Demo1{
    public static void main(String[] args) {
    //    System.out.print("Hi");
    //    System.out.print(args[0]);
    //    System.out.print(",How are You?");
    //    int x=Integer.parseInt(args[0]);
    //    System.out.println("The Square Root of "+x+"is "+Math.sqrt(x));
        
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Please enter value of a = ");
        // int a=sc.nextInt();
        // System.out.print("Please enter value of b = ");
        // int b=sc.nextInt();
        // System.out.printf("The sum of %d and %d is %d\n",a,b,(a+b));
        double avg=0;
        int sum=0;
        ArrayList <Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values in array");
        while(sc.hasNextInt())
        {
            al.add(sc.nextInt());
        }
        for(int i=0;i<al.size();i++)
        {
            sum+=al.get(i);
        }
        avg=sum/al.size();
        System.out.println("The sum of all array elements is "+sum+" and the average is "+avg);
        

    }
    
}
