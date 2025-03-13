public class Rekening {
    String nama_pemilik;
    String no_rekening;
    double saldo; 

    public Rekening(String pemilik, String norek, double saldo) {
        nama_pemilik = pemilik;
        no_rekening = norek;
        this.saldo = saldo;
    }

    public Rekening(String nama_pemilik, double saldo){
        this.nama_pemilik = nama_pemilik;
        this.saldo = saldo;
    }
    
    public String getNamaPemilik() {
        return nama_pemilik;
    }

    public void setNamaPemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getno_rekening() {
        return no_rekening;
    }

    public void setno_rekening(String no_rekening) {
        this.no_rekening = no_rekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            System.out.println("Saldo tidak mencukupi");
            saldo += jumlah;
        }else{
            saldo -= jumlah;
        }
    }

    public void infoRekening() {
        System.out.println("Nama Pemilik: " + getNamaPemilik());
        System.out.println("No. Rekening: " + getno_rekening());
        System.out.println("Saldo: " + getSaldo());
    }
}
