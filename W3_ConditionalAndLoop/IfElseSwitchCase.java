public class IfElseSwitchCase {
    public static void main(String[] args) {
        int value = 3;
        
        // versi if-else
        System.out.println("if-else");
        if(value == 1 || value == 2 || value == 3)
                System.out.println("1 2 3");
        else if(value == 4 || value == 5 || value == 6)
                System.out.println("4 5 6");
        else
                System.out.println("apa ini if-else");
                
        // versi switch-case
        System.out.println("switch-case");
        switch (value){
            case 1: case 2: case 3:
                System.out.println("1 2 3");
                break;
            case 4: case 5: case 6:
                System.out.println("4 5 6");
                break;
            default:
                System.out.println("apa ini switch-case");
                break;
        }
    }
    
}
