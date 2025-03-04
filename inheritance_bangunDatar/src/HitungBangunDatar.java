import java.util.Scanner;

public class HitungBangunDatar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilih jenis bangun datar:");
            System.out.println("1. Bujur Sangkar");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi Panjang");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();
    
            if (pilihan == 1) {
                System.out.print("Masukkan panjang sisi bujur sangkar: ");
                double sisi = scanner.nextDouble();
                BujurSangkar bujurSangkar = new BujurSangkar(sisi);
                System.out.println("Luas: " + bujurSangkar.hitungLuas());
                System.out.println("Keliling: " + bujurSangkar.hitungKeliling());
            } else if (pilihan == 2) {
                System.out.print("Masukkan alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                System.out.print("Masukkan sisi 1 segitiga: ");
                double sisi1 = scanner.nextDouble();
                System.out.print("Masukkan sisi 2 segitiga: ");
                double sisi2 = scanner.nextDouble();
                System.out.print("Masukkan sisi 3 segitiga: ");
                double sisi3 = scanner.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
                System.out.println("Luas: " + segitiga.hitungLuas());
                System.out.println("Keliling: " + segitiga.hitungKeliling());
            } else if (pilihan == 3) {
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.println("Luas: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            scanner.close();
    }
}
