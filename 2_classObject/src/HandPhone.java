public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setJenisHp(String jenis_hp) {
        this.jenis_hp = jenis_hp;
        tahun_pembuatan = tahun_pembuatan;
    }
     String getJenisHp() {
        return jenis_hp;
     }

     int getTahunPembuatan() {
        return tahun_pembuatan;
     }

     public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setJenisHp("Apple");
        hp.tahun_pembuatan = 2024;
        System.out.println("Jenis HP: " + hp.getJenisHp());
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan());
    
        hp.getJenisHp();
        hp.getTahunPembuatan();
     }

}