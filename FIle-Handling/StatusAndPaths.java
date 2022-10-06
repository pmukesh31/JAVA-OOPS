import java.io.File;
import java.io.IOException;
public class StatusAndPaths{
    public static void main(String args[])throws IOException
    {
        
        
            File myFile;
            myFile=new File("demo.txt");
            getPaths(myFile);
            getInfo(myFile);
        
        
    }
    static void getPaths(File file) throws IOException
    {
        System.out.println("File Name is "+file.getName());
        System.out.println("File Path is "+file.getPath());
        System.out.println("Parent of File is "+file.getParent());
    }
    static void getInfo(File file) throws IOException
    {
        System.out.println("File exists : "+file.exists());
        System.out.println("File can read "+file.canRead()+" File can write "+file.canWrite() );
        System.out.println("Last modified "+file.lastModified());




    }
}