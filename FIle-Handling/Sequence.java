import java.io.*;

public class Sequence {
    public static void main(String arsg[])throws IOException
    {
        FileInputStream ins=new FileInputStream("bufferoutput.txt");
        FileInputStream ins1=new FileInputStream("demo.txt");
        SequenceInputStream s=new SequenceInputStream(ins,ins1);
        int c;
        while((c=s.read())!=-1)
        {
            System.out.print((char)c);
        }
        s.close();
        ins.close();
        ins1.close();
    }
}
