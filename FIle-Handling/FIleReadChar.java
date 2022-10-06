import java.io.*;
public class FIleReadChar {
    public static void main(String args[])throws IOException
    {
        File file1=new File("dummy.txt");
        File file2=new File("joey.txt");
        FileReader fil=new FileReader(file1);
        FileWriter fol=new FileWriter(file2);
        int ch;
        while((ch=fil.read()) != -1)
            fol.write(ch);
        fil.close();
        fol.close();
    }
}
