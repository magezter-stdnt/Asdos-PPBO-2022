    import java.io.FileNotFoundException;  // Import this class to handle errors
    
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;public class BReadFile {

  public static void main(String[] args) {
    try {
        BufferedReader br = new BufferedReader(new FileReader("filename.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }

}
