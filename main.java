package bangundatar;
import java.util.Scanner;

public class IT001202000024 {
    public static void main (String[]args){
        float NULL = 0;
        float r;
        float p;
        float l;
        float t;
        float sisi;
        float panjang;
        float lebar;
        int pilih;

        Scanner input = new Scanner(System.in);
System.out.println("Choose Shape : ");
System.out.println("1. Rectangle");
System.out.println("2. Circle");
System.out.println("3. Cylinder");
System.out.println("4. Cube");
System.out.println("5. Sphere");
System.out.println("6. Block");  

pilih = input.nextInt();

if (pilih == 1){
    System.out.println("Enter long = ");
    panjang = input.nextFloat();
    System.out.println("Enter width = ");
    lebar = input.nextFloat();
    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang,lebar);
    persegiPanjang.luas();
    persegiPanjang.hasilLuas();
    persegiPanjang.keliling();
    persegiPanjang.hasilKeliling();

}
else if (pilih == 2){
    System.out.println("Enter radius = ");
    r = input.nextFloat();
    Lingkaran lingkaran = new Lingkaran(r);
    lingkaran.luas();
    lingkaran.hasilLuas();
    lingkaran.keliling();
    lingkaran.hasilKeliling();

}
else if (pilih ==3){
    System.out.println("Enter radius : ");
    r = input.nextFloat();
    System.out.println("Enter height : ");
    t = input.nextFloat();
    Cylinder cylinder = new Cylinder(r,t);
    cylinder.luas();
    cylinder.hasilLuas();
    cylinder.volume();
    cylinder.hasilVolume();
}
else if (pilih ==4){
    System.out.println("Enter side : ");
    sisi = input.nextFloat();
    Cube cube = new Cube(sisi);
    cube.luas();
    cube.hasilLuas();
    cube.volume();
    cube.hasilVolume();
}
else if (pilih ==5){
    System.out.println("Enter radius : ");
    r = input.nextFloat();
    Sphere sphere = new Sphere(r);
    sphere.luas();
    sphere.hasilLuas();
    sphere.volume();
    sphere.hasilVolume();
}
else if (pilih ==6){
    System.out.println("Enter long : ");
    p = input.nextFloat();
    System.out.println("Enter width : ");
    l = input.nextFloat();
    System.out.println("Enter height : ");
    t = input.nextFloat();
    Block block = new Block(p,l,t);
    block.luas();
    block.hasilLuas();
    block.volume();
    block.hasilVolume();

}

    }
}
