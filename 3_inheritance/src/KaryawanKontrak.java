public class KaryawanKontrak extends Karyawan{
    double gaji_perhari;
    int jml_masuk;
    public KaryawanKontrak(String nama, double tunjangan){
        super (nama, tunjangan);
        gaji_perhari = 200000;
    }

    public void setKaryawanKontrak (double gph, int jml_masuk){
        gaji_perhari = gph;
        this.jml_masuk = jml_masuk;
    }

    public double getGaji(){
        double total =
        (gaji_perhari * jml_masuk) + super.getTunjangan();
        return total;
    }

    public void infoKaryawan(){
        System.out.println("Nama: " + super.getNama());
        System.out.println("Gaji Perhari: " + gaji_perhari);
        System.out.println("Jumlah Masuk: " + jml_masuk);
        System.out.println("Tota; Gaji: " + getGaji());
        System.out.println("==============================");
    }
}
