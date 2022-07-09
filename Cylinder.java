package bangundatar;

public class Cylinder extends BangunDatar{
    float r;
    float t;

    public Cylinder(float r, float t){
        this.r = r;
        this.t = t;
    }
    @Override
    public float volume(){
        return (float)  (Math.PI * r * r * t);
    }
    @Override
    public float luas(){
        return (float)  (Math.PI * r * 2) * (r + t);

    }
    public void hasilLuas(){
        System.out.println("The area = " + luas());
    }
    public void hasilVolume(){
        System.out.println("The Volume = " + volume());
    }

    
}
