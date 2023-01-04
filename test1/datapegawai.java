package test1;

class  pegawai{
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajiPokok;
    private double gajibesih;

    pegawai(String nama,String jabatan,double pajak){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;
    }

    public void setGajiPokok(float gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajibesih() {
        return gajibesih = gajiPokok - (gajiPokok*pajak);
    }
    void display(){
        System.out.println("Nama Pegawai :" + this.nama);
        System.out.println("Jabatan :" + this.jabatan);
        System.out.println("gaji Bersih :" + getGajibesih() );
    }
    
}

public class datapegawai {
    public static void main(String[] args) {
        pegawai g1 = new pegawai("Lalu Kaspun Nuri", "Direktur", 0.06);
        g1.setGajiPokok(2000000);
        g1.display();
    }
}
