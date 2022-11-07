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


public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        var policeDog = new PoliceDog();
        var wildDog = new WildDog();

        policeDog.Walk();
        policeDog.Track();

        wildDog.Bark();
        wildDog.HuntFood();
    }    
}
