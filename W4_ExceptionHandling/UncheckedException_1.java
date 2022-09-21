class UncheckedException_1 {
    public static void main(String args[]){
        
        int x = 10;
        int y = 0;
        int z = x / y;
        System.out.println(z);
        
        try {
            
        } catch (ArithmeticException e) {
            System.out.print("Exception ditangkap : ");
            System.out.println(e);
        }


    }
}