import java.io.*;
public class BufferOutput {
    public static void main(String args[])throws IOException
    {
        FileOutputStream out=new FileOutputStream("bufferoutput.txt");
        BufferedOutputStream bout=new BufferedOutputStream(out);
        String s="Welcome to Demonstration of Buffered Output";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.close();
        out.close();
        //We use Buffer when there are a network of inputs coming and we need to handle it nicely
        //Example a large image is to be stored so we use buffer
    }
    
}
