// Class untuk menghitung luas persegi panjang
class PersegiPanjang {
    private double panjang;
    private double lebar;

    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Getter dan Setter
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}

public class HitungLuas {
    public static void main(String[] args) {
        // Membuat objek persegi panjang dengan ukuran 12 cm x 7 cm
        PersegiPanjang areaHitam = new PersegiPanjang(12, 7);
        
        // Menghitung dan menampilkan luas
        double luas = areaHitam.hitungLuas();
        System.out.println("Luas area hitam adalah: " + luas + " cm²");
    }
}