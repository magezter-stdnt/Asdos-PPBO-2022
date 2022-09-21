public class W2_Variable_2 {
    
// Wrapper Class
    public static void main(String args[]) {
        Character objChar = 'w'; //mengeluarkan output 'w' jika di-print
        Byte objByte = 12; //mengeluarkan output '12' jika di-print
        Short objShort = 100; //mengeluarkan output '100' jika di-print
        Integer objInt = 523; //mengeluarkan output '523' jika di-print 
        Long objLong = 1_000_000_000_000_000L; //mengeluarkan output '1000000000000000' jika di-print
        Boolean objBoolean = true; //mengeluarkan output 'true' jika di-print
        Float objFloat = 82.89f; //mengeluarkan output '82.89' jika di-print
        Double objDouble = 34.67; //mengeluarkan output '34.67' jika di-print

        System.out.println("objChar= " + (objChar));
        System.out.println("objByte= " + (objByte));
        System.out.println("objShort= " + (objShort));
        System.out.println("objInt= " + (objInt).compareTo(5)); // print 1
        System.out.println("objLong= " + (objLong));
        System.out.println("objBoolean= " + (objBoolean));
        System.out.println("objFloat= " + (objFloat));
        System.out.println("objDouble= " + (objDouble));

    }
   
}
