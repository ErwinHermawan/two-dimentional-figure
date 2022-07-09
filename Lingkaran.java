package bangundatar;

public class Lingkaran extends BangunDatar {
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }
    
    @Override
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    
    @Override
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
        public void hasilLuas(){
        System.out.println("The area = " + luas());
    }
    public void hasilKeliling(){
        System.out.println("The perimeter = " + keliling());
    
    }

}
    
