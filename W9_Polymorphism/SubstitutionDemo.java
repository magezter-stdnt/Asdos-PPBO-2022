class Parent{
    void method(){ System.out.println("method called from Parent");}
}
class Child extends Parent{
    @Override
    void method(){ System.out.println("method called from Child");}

    void methodFromParent() { super.method();}
}

public class SubstitutionDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method(); // calls Parent's method()
        // parent.methodFromParent(); //error karena Parent tidak ada methodFromParent()
        System.out.println("============");

        
        // substitusi
        Parent child = new Child();
        child.method(); 
        // child.methodFromParent(); //error karena Parent tidak ada methodFromParent()
        System.out.println("============");


        Child child2 = new Child();
        child2.method();
        child2.methodFromParent();
    }
}
