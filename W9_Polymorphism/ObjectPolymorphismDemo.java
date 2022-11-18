import java.util.ArrayList;

class Dummy1 {
    void printHello(){ System.out.println("hello");}
}
class Dummy2 {
    void printWorld(){ System.out.println("World");}
}
class Dummy3 {}


public class ObjectPolymorphismDemo {
    public static void main(String[] args) {
        var dummy1 = new Dummy1();
        System.out.println(dummy1.getClass());
        dummy1.printHello();
        System.out.println("===========");

        // upcasting
        Object objFromDummy1 = (Object) dummy1;
        System.out.println(objFromDummy1.getClass());
        // objFromDummy1.printHello(); // error karena Object tidak punya method printHello()
        System.out.println("===========");

        // downcasting
        Dummy2 dummy2 = new Dummy2();
        Object objFromDummy2 = (Object) dummy2;
        Dummy2 dummy2FromObj = (Dummy2) objFromDummy2;
        System.out.println(dummy2FromObj.getClass());
        dummy2FromObj.printWorld();
        System.out.println("===========");


        ArrayList<Object> objArr = new ArrayList<Object>();
        objArr.add(new Dummy1());
        objArr.add(new Dummy2());
        objArr.add(new Dummy3());

        objArr.forEach((element) -> {
            System.out.println(element.getClass());
        });
    }
}
