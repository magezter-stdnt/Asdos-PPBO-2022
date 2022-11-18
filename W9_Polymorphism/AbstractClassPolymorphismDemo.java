abstract class AbstractParent {
    void method() { System.out.println("method from AbstractParent"); }
}

class Child extends AbstractParent {
    @Override 
    void method() { System.out.println("method from Child");}
    void childMethod() { System.out.println("child method");}
}

public class AbstractClassPolymorphismDemo {
    public static void main(String[] args) {
        // error tidak bisa membuat instance dari abstract class
        // AbstractParent aParent = new AbstractParent(); 

        AbstractParent childViaAParent = new Child();
        System.out.println(childViaAParent.getClass());
        // aParent.method(); // error karena tidak bisa memanggil method via instance abstract class
        Child child = (Child) childViaAParent;
        child.method();

    }
}
