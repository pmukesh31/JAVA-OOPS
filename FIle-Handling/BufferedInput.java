import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInput {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin=new FileInputStream("bufferoutput.txt");
        BufferedInputStream bins=new BufferedInputStream(fin);
        int ch;
        while((ch=bins.read())!=-1)
        {
            System.out.print((char)ch + " ");
        }
        fin.close();
        bins.close();
    }
}
