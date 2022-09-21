public class W2_Constructor_2 {
    public static void main(String[] args) {
        M4A4 gun = new M4A4();

        for(int i=0; i<15; i++){
            gun.Fire();
            if(gun.isOutOfAmmo){
                gun.Reload(false);
            }
        }
    }
}


class M4A4 {
    final int MAX_MAGAZINE = 10;
    int currentMagazine;
    boolean isOutOfAmmo;

    M4A4()
    {
        System.out.println("You have bought M4A4");
        Reload(true);
        
    }

    void Reload(boolean justBought)
    {
        currentMagazine = MAX_MAGAZINE;
        if(!justBought){ System.out.println("Reloading..."); }
        isOutOfAmmo = false;
    }

    void Fire()
    {
        if(isOutOfAmmo){
            System.out.println("Out of Ammo!");
            return;
        }

        currentMagazine--;
        System.out.println("*drrt*");

        if(currentMagazine <= 0){
            isOutOfAmmo = true;
        }
    }
}