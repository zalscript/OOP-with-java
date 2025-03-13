public class Tabungan extends Rekening{
    double bungaTahunan;

    public Tabungan (String nama_pemilik, double saldo, double bunga){
        super(nama_pemilik, saldo);
        bungaTahunan = bunga;
    }

    public double hitungBunga(int bulan){
        return saldo * ( bungaTahunan / 12) * saldo * bulan;
    }

    public void infoRekening(){
        System.out.println("Nama Pemilik: " + super.getNamaPemilik());
        System.out.println("No. Rekening: " + super.getno_rekening());
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("Bunga: " + hitungBunga(12));
        System.out.println("======================================");
    }
    
}