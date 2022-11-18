class Segitiga {}
class SegitigaSamaKaki extends Segitiga{}
// SegitiaSamaKaki IS-A Segitiga
class Persegi {}

class Foo {
    Segitiga getSegitiga(){
        return new Segitiga();
    }
}

class FooFoo extends Foo {
    @Override
    SegitigaSamaKaki getSegitiga(){
        return new SegitigaSamaKaki();
    }

    // @Override
    // Persegi getSegitiga(){
    //     return new Persegi();
    // }
}

public class CovariantOverridingDemo {
    public static void main(String[] args) {
        var foo = new Foo();
        System.out.println(foo.getSegitiga().getClass());

        var foofoo = new FooFoo();
        System.out.println(foofoo.getSegitiga().getClass());
    }
}
