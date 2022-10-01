// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Character2 {
    public static void main(String[] args) {

        // unicode jepun
        char first1 = '\u3090';
        System.out.println(first1);
        
        // bandingkan 0 dengan null pada unicode
        char second2 = (0=='\u0000') ? 'T' :'F';
        System.out.println(second2);

        char third3 = '\u007D';
        System.out.println(third3);
    }
}