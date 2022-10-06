import java.io.*;
public class CopyUsingByte {
    public static void main(String args[]) throws IOException
    {
        FileInputStream ins=new FileInputStream("input1.txt");
        FileOutputStream out=new FileOutputStream("output1.txt");
        byte byteRead;
        byteRead = (byte)ins.read();
        while(byteRead!=-1)
        {
            out.write(byteRead);
            byteRead = (byte)ins.read();
        }
        ins.close();
        out.close();
    }
}
