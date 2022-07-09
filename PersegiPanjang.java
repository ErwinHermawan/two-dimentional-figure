package bangundatar;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public float luas(){
        return this.panjang * this.lebar;
    }
    @Override
    public float keliling(){
        return (this.panjang + this.lebar)*2;
    }
    public void hasilLuas(){
        System.out.println("The area = " + luas());
    }
    public void hasilKeliling(){
        System.out.println("The perimeter = " + keliling());
    }
}
