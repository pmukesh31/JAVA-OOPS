import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String args[]) throws IOException
    
    {
        byte cities[]={'L','O','N','D','O','N','\n','M','A','D','R','A','S'};
        FileOutputStream filout=new FileOutputStream("demo.txt");
        filout.write(cities);
        filout.close();
        // FileOutputStream newfil=new FileOutputStream("demo.txt");
        // String s="Hello My Name is Demo";
        // byte n[]=s.getBytes();
        // newfil.write(n);
        // newfil.close();
        

    }
}
