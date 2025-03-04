public class BujurSangkar extends BangunDatar{
    double sisi;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}
