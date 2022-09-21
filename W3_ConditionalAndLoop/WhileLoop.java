public class WhileLoop {
    public static void main(String[] args) {
        Monster monster = new Monster();
        while(monster.HasEnergy()){
            monster.Chase();
        }

        System.out.println("The monster is out of energy..");
    }
}

class Monster
{
    int energy;
    int maxEnergy = 10;

    Monster(){
        ReplenishEnergy();
    }

    void ReplenishEnergy(){
        energy = maxEnergy;
    }

    boolean HasEnergy(){
        return energy > 0 ? true : false;
    }

    void Chase(){
        System.out.println("The monster is chasing you!");
        energy--;
    }
}



