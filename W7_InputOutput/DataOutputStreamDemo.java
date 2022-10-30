import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void main(String[] args) 
    throws IOException {
        
        File oFile = new File(System.getProperty("user.dir") + "/tmp/sample2.data");
        var oFileStream = new FileOutputStream(oFile);
        var oDataStream = new DataOutputStream(oFileStream);

        oDataStream.writeInt(123);
        oDataStream.writeLong(99999L);
        oDataStream.writeFloat(3.14f);
        oDataStream.writeDouble(1.62);
        oDataStream.writeChar('X');
        oDataStream.writeBoolean(true);

        oDataStream.close();
    }
}
