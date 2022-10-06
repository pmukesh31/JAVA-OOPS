import java.io.*;

public class ReadFile {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin=new FileInputStream("demo.txt");
        int size=fin.available();
        System.out.println("Size of file is "+size);
        System.out.println("Reading 1/4 of file");
        for(int i=0;i<size/4;i++)
        {
            System.out.println((char)fin.read());
        }
        System.out.println("File size left to read is "+fin.available());
        byte b[]=new byte[size/2];
        if(fin.read(b)!=b.length)
        {

            System.out.println("Error");
        }
        else{
            String temp=new String(b,0,0,b.length);//Convert to string
            System.out.println(temp);
            System.out.println("File size left to read is "+fin.available());
            System.out.println("Skipping other part using skip function");
            fin.skip(size/4);
            System.out.println("File size left to read is "+fin.available());
        }
        int c;
        while((c=fin.read())!=-1)
        System.out.println((char)c);

        fin.close();

    }
}
