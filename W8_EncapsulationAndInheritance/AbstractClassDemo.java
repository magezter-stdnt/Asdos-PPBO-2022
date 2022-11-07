abstract class BangunDatar {
    abstract float getLuas();
    abstract float getKeliling();
}

class Persegi extends BangunDatar {
    float sisi;

    public Persegi(float sisi){
        this.sisi = sisi;
    }

    @Override
    public float getLuas(){ return sisi*sisi; }
    public float getKeliling() { return 4*sisi; }
}

class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float getLuas(){ return panjang*lebar; }
    public float getKeliling() { return 2*(panjang+lebar); }
}



public class AbstractClassDemo {
    public static void main(String[] args) {
        var persegi = new Persegi(5f);
        var persegiPanjang = new PersegiPanjang(4f, 6f);
        
        System.out.println("persegi dengan sisi " + persegi.sisi);
        System.out.println("memiliki luas " + persegi.getLuas() + " dan keliling " + persegi.getKeliling() );
        
        System.out.println("persegi panjang dengan panjang " + persegiPanjang.panjang + " dan lebar " + persegiPanjang.lebar);
        System.out.println("memiliki luas " + persegiPanjang.getLuas() + " dan keliling " + persegiPanjang.getKeliling() );
    }
}
