package bangundatar;

public class Cube extends BangunDatar{
    float sisi;
    public Cube (float sisi){
        this.sisi = sisi;
    }
    @Override
    public float luas(){
        return this.sisi * 6 * this.sisi;
    }
    @Override
    public float volume(){
        return this.sisi * this.sisi * this.sisi;
    }
    public void hasilLuas(){
        System.out.println("The area = " + luas());
    }
    public void hasilVolume(){
        System.out.println("The Volume = " + volume());
    }
}
