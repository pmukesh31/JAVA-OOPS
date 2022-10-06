import java.io.*;
public class RAF1 {
    public static void main(String args[])throws IOException
    {
        RandomAccessFile file=new RandomAccessFile("useme.txt","rw");
        file.writeInt(444);
        file.writeChar('x');
        file.seek(0);//Go to begining
        System.out.println(file.readInt());
        file.seek(file.length());
        file.writeBoolean(false);
        System.out.println(file.readBoolean());
        file.close();
    }
}
