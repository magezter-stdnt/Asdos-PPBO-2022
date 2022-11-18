import java.util.ArrayList;
import java.util.Random;


abstract class Pelajar {
    abstract void introduction();
}

class Mahasiswa extends Pelajar {
    @Override void introduction() {System.out.println("Saya adalah Mahasiswa");}
}
class SiswaSMA extends Pelajar {
    @Override void introduction() {System.out.println("Saya adalah SiswaSMA");}
}
class SiswaSMP extends Pelajar {
    @Override void introduction() {System.out.println("Saya adalah SiswaSMP");}
}
class SiswaSD extends Pelajar {
    @Override void introduction() {System.out.println("Saya adalah SiswaSD");}
}

public class PolymorphismUsageDemo {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Pelajar> pelajarArr = new ArrayList<Pelajar>();
    
        for(int i=0; i<20; i++){
            Pelajar newPelajar;
    
            int randomNumber = random.nextInt(100);
            if(randomNumber < 25){
                newPelajar = new Mahasiswa();
            } else if(randomNumber < 50){
                newPelajar = new SiswaSMA();
            } else if(randomNumber < 75){
                newPelajar = new SiswaSMP();
            } else {
                newPelajar = new SiswaSD();
            }
    
            pelajarArr.add(newPelajar);
        }

        // =================================

        pelajarArr.forEach((pelajar) -> {
            if(pelajar instanceof Mahasiswa){
                ( (Mahasiswa)pelajar ).introduction();
            }
            else if(pelajar instanceof SiswaSMA){
                ( (SiswaSMA)pelajar ).introduction();
            }
            else if(pelajar instanceof SiswaSMP){
                ( (SiswaSMP)pelajar ).introduction();
            }
            else if(pelajar instanceof SiswaSD){
                ( (SiswaSD)pelajar ).introduction();
            }
            else {
                System.out.println("invalid class");
            }
        });

        // altenative
        for(Pelajar pelajar : pelajarArr){
            if(pelajar instanceof Mahasiswa){
                ( (Mahasiswa)pelajar ).introduction();
            }
            else if(pelajar instanceof SiswaSMA){
                ( (SiswaSMA)pelajar ).introduction();
            }
            else if(pelajar instanceof SiswaSMP){
                ( (SiswaSMP)pelajar ).introduction();
            }
            else if(pelajar instanceof SiswaSD){
                ( (SiswaSD)pelajar ).introduction();
            }
            else {
                System.out.println("invalid class");
            }
        }
    }
}

