import java.io.*;
public class Data_InputStream {
    public static void main(String args[]) //throws Exception
    {
        try{
        DataInputStream in=new DataInputStream(System.in);
        Float principamt=new Float(0);
        Float rateofin=new Float(0);
        String temp;
        int No_ofYears=0;
        System.out.println("Enter the Principal Amount");
        System.out.flush();
        temp=in.readLine();
        principamt=Float.valueOf(temp);
        System.out.println("Enter the Rate of Interest ");
        System.out.flush();
        temp=in.readLine();
        rateofin=Float.valueOf(temp);
        System.out.println("Enter Number of Years ");
        System.out.flush();
        temp=in.readLine();
        No_ofYears=Integer.parseInt(temp);
        float Interestval=principamt*rateofin*No_ofYears;
        System.out.print("The Interest Value is  "+Interestval);
        }
        catch(Exception ex){}

    }
}
