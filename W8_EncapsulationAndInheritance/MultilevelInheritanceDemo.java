class A {
    void methodFromA(){
        System.out.println("this is method from class A");
    }
}

class B extends A {
    void methodFromB(){
        System.out.println("this is method from class B");
    }
}
class C extends B{
    void methodFromC(){
        System.out.println("this is method from class C");
    }
}


// class B {
//     void methodFromA(){
//         System.out.println("this is method from class A");
//     }
//     void methodFromB(){
//         System.out.println("this is method from class B");
//     }
// }
// class C {
//     void methodFromA(){
//         System.out.println("this is method from class A");
//     }
//     void methodFromB(){
//         System.out.println("this is method from class B");
//     }
//     void methodFromC(){
//         System.out.println("this is method from class C");
//     }
// }



public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        var cObject = new C();

        cObject.methodFromA(); 
        cObject.methodFromB(); 
        cObject.methodFromC();
        
        System.out.println("C class is-a B class : " + (cObject instanceof B));
        System.out.println("A class is-a C class : " + (new A() instanceof C));
    }    
}
