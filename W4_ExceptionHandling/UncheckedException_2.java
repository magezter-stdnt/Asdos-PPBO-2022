public class UncheckedException_2 {
    public static void main(String[] args){
        try {
            Object x[] = new String[3];
            x[0] = 3;

            int[] arr = {23};
            System.out.println(arr[3]);

            int[] arrs = null;
            System.out.println(arrs[0]);
            
        } catch (ArrayStoreException e) {
            System.out.println("Catch ArrayStoreException");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Catch IndexOutOfBoundsException");
        }
        catch(NullPointerException e){
            System.out.println("Catch NullPointerException");
        }catch(Exception e){
            System.out.println("Catch Exception");
        }



        System.out.println("Andaikan ini kode utama program - berjalan ");
        
    }
}
