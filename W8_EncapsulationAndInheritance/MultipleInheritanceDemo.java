
interface IKillable {
    void OnKill();
}

interface IRespawnable {
    void Respawn(String respawnPlace);
}

class Monster implements IKillable, IRespawnable {
    public void OnKill(){
        System.out.println("this monster is killed");
    }

    public void Respawn(String respawnPlace){
        System.out.println("this monster respawned at " + respawnPlace);
    }
}


public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        var monster = new Monster();

        monster.OnKill();
        monster.Respawn("the monster hut");
    }
}   
