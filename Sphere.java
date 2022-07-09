package bangundatar;

public class Sphere extends BangunDatar {
    float r;

    public Sphere(float r){
        this.r = r;
    }
    @Override
    public float luas(){
        return (float)  (Math.PI * r * r * 4);
    }
    @Override
    public float volume(){
        return (float)  (Math.PI * r * r * r *4/3);
    }
    public void hasilLuas(){
        System.out.println("The area = " + luas());
    }
    public void hasilVolume(){
        System.out.println("The Volume = " + volume());
}
}
