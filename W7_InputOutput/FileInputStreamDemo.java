import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) 
        throws IOException{
        
        File iFile = new File(System.getProperty("user.dir") + "/tmp/sample1.data");
        var iStream = new FileInputStream(iFile);
        
        int fileSize = (int) iFile.length();
        byte[] byteArr = new byte[fileSize];

        iStream.read(byteArr);
        for(int i=0; i<fileSize; i++){
            System.out.println(byteArr[i]);
        }

        iStream.close();
    }
}
