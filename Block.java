package bangundatar;

public class Block extends BangunDatar {
float p;
float l;
float t;

public Block(float p,float l, float t){
    this.p = p;
    this.l = l;
    this.t = t;
}
@Override
public float luas(){
    return (this.p * this.l) + (this.p * this.t) + (this.l * this.t) *2; 
}
@Override
public float volume(){
    return this.p * this.l * this.t;
}
public void hasilLuas(){
    System.out.println("The area = " + luas());
}
public void hasilVolume(){
    System.out.println("The Volume = " + volume());
}
}
