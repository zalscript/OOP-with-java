public class DataOrang<T, U, V> {
    private T nama;
    private U umur;
    private V alamat;

    public DataOrang(T nama, U umur, V alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public T getNama() {
        return nama;
    }

    public U getUmur() {
        return umur;
    }

    public V getAlamat() {
        return alamat;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }

    public void setUmur(U umur) {
        this.umur = umur;
    }

    public void setAlamat(V alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur + ", Alamat: " + alamat;
    }

    public static void main(String[] args) {
        // Membuat objek DataOrang
        DataOrang<String, Integer, String> orang1 = new DataOrang<>("John Doe", 25, "Jl. Merdeka No. 10");
        DataOrang<String, String, String> orang2 = new DataOrang<>("Ada Lovelace", "30 tahun", "Jl. Sudirman No. 5");
        
        // Menampilkan data
        System.out.println(orang1);
        System.out.println(orang2);
        
        // Mengubah data
        orang1.setUmur(26);
        orang2.setAlamat("Jl. Gatot Subroto No. 15");
        
        System.out.println("\nSetelah diupdate:");
        System.out.println(orang1);
        System.out.println(orang2);
    }
}