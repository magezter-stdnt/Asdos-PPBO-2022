import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) 
        throws IOException {
        
        File oFile = new File(System.getProperty("user.dir") + "/tmp/sample1.data");
        var oStream = new FileOutputStream(oFile);

        byte[] byteArr = {
            10, 20, 30, 40,
            50, 60, 70, 80
        };

        oStream.write(byteArr);
        oStream.close();
    }
}
