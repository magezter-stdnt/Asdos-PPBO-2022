public class UncheckedException_2 {
    public static void main(String[] args){
        try {
            arrayStore();
            indexOut();
            nullPointer();
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

    static void arrayStore(){
        Object x[] = new String[3];
        x[0] = 3;
    }
    static void indexOut(){
        int[] arr = {23};
        System.out.println(arr[3]);
    }
    static void nullPointer(){
        int[] arrs = null;
        System.out.println(arrs[0]);

    }
}
