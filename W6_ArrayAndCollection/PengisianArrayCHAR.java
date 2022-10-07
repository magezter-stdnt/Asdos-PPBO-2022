public class PengisianArrayCHAR {
    public static void main(String[] args) {
        // 1
        char[] charArray = new char[5];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';
        charArray[4] = 101;
        printArray(charArray);

        // charArray[5] = 'x';
        // System.out.println(charArray[5]);
        


        // // 2
        // char[] charArray2 = new char[5];
        // for (int i = 0; i < charArray2.length; i++) {
        //     charArray2[i] = (char) (i+97);
        // }
        // printArray(charArray2);

        

        // // 2 - literal
        // char[] charArray3 = new char[]{'a', 'b', 'c', 'd', 'e'};
        // printArray(charArray3);
    }

    static int counter = 1;

    static void printArray(char[] charArray) {
        System.out.println("Array ke-" + counter + ":");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(" > " + charArray[i]);
        }
        counter++;
    }
}
