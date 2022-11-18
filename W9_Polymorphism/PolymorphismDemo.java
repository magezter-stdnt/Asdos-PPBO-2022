class Dog {
    protected int totalLeg = 4;
    protected boolean isMammalAnimal = true;

    protected void Walk(){
        System.out.println("Walking...");
    }

    protected void Bark() {
        System.out.println("Barking...");
    }
}

class PoliceDog extends Dog {
    void Track(){
        System.out.println("Tracking...");
    }
}

class WildDog extends Dog {
    void HuntFood(){
        System.out.println("Hunting for food...");
    }
}

public class PolymorphismDemo {

    
    public static void main(String[] args) {
        PoliceDog pDog = new PoliceDog();
        System.out.println(pDog.getClass());
        pDog.Walk();
        pDog.Track();
        System.out.println("===========");

        //upcasting
        Dog pDogToDog = (Dog) pDog;
        System.out.println(pDogToDog.getClass());
        pDogToDog.Walk();
        // pDogToDog.Track(); // error karena class Dog tidak memiliki method Track()
        System.out.println("===========");

        //downcasting

        // Dog dogFromWDog = new Dog();

        WildDog wDog = new WildDog();
        Dog dogFromWDog = (Dog) wDog;

        System.out.println(dogFromWDog.getClass());

        if(dogFromWDog instanceof WildDog){
            WildDog wDogFromDog = (WildDog) dogFromWDog;
            System.out.println(wDogFromDog.getClass());
            wDogFromDog.Bark();
            wDogFromDog.HuntFood();
        } else {
            System.out.println("downcasting failed");
        }
    }
}
