import java.io.*;
 
class CheckedException_1 {
    public static void main(String[] args){
        FileReader file = new FileReader("C:\\test\\a.txt");
 
        BufferedReader fileInput = new BufferedReader(file);
 
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
 
        fileInput.close();
        
        try {
            
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("Done - from finally");
        }

        System.out.println("Program selesai");
    }
}