import java.io.*;
import java.nio.Buffer;
public class CombBufferd
{
    public static void main(String args[])throws IOException
    {
        FileInputStream ins=new FileInputStream("bufferoutput.txt");
        FileInputStream ins1=new FileInputStream("demo.txt");
        SequenceInputStream s=new SequenceInputStream(ins,ins1);
        BufferedInputStream bins=new BufferedInputStream(s);
        BufferedOutputStream bout=new BufferedOutputStream(System.out);
        int ch;
        while((ch=bins.read())!=-1)
        {
            bout.write((char)ch);
        }
        bins.close();
        ins1.close();
        ins.close();
    }
}