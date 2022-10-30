import java.io.File;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;


public class DataInputStreamDemo {
    public static void main(String[] args) 
    throws IOException{
        
        File iFile = new File(System.getProperty("user.dir") + "/tmp/sample2.data");
        var iFileStream = new FileInputStream(iFile);
        var iDataSTream = new DataInputStream(iFileStream);
        
        System.out.println(iDataSTream.readInt());
        System.out.println(iDataSTream.readLong());
        System.out.println(iDataSTream.readFloat());
        System.out.println(iDataSTream.readDouble());
        System.out.println(iDataSTream.readChar());
        System.out.println(iDataSTream.readBoolean());

        iDataSTream.close();
    }
}
