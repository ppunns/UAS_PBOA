package test1;

import java.util.jar.JarOutputStream;

class hitungLingkaran{
    double jari_jari;

    hitungLingkaran(double jari_jari){
        this.jari_jari = jari_jari;
    }
    
    public double Diameter() {
        return jari_jari*2;
    }
    public double KellilingLingkaran(){
        return 2*Math.PI*jari_jari;
    }
    public double LuasLingkaran(){
        return Math.PI*jari_jari*jari_jari;
    }

    void display(){
        System.out.println("jari- jari adalah "+ this.jari_jari);
        System.out.println("Diamater Lingkaran "+ Diameter());
        System.out.println("Luas Lingkaran "+ LuasLingkaran());
        System.out.println("kelliling Lingkaran "+ KellilingLingkaran());
    }


}

public class lingkaran {
    public static void main(String[] args) {
        hitungLingkaran h1 = new hitungLingkaran(7);
        h1.display();
    }
}
