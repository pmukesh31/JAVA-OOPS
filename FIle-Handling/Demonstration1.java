import java.io.*;
public class Demonstration1 {
    public static void main(String args[]) throws IOException
    {
        File fin=new File("demo.txt");
        FileOutputStream fos=new FileOutputStream(fin);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(3534);
        dos.writeChar('x');
        dos.writeBoolean(false);
        fos.close();
        dos.close();
        FileInputStream fis=new FileInputStream(fin);
        DataInputStream dis=new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());

        dis.close();
        fis.close();
    }


}