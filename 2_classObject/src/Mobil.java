public class Mobil {
    String merk;
    String warna;
    int kecepatan;
    boolean nyala = false;

    public void setDataMobil (String b, String warna, int k){
        merk = b;
        kecepatan = k;
        this.warna = warna;
    }

    public String getMerk (){
        return merk;
    }

    public String getWarna (){
        return warna;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void nyalakanMobil(boolean nyala){
    }

    public void tambahKecepatan(int k){
        kecepatan = kecepatan + k;
    }

    public void infoMobil(){
        System.out.println("Merk Mobil: " + getMerk());
        System.out.println("warna Mobil: " + getWarna());
        System.out.println("Kecepatan: " + getKecepatan());
        System.out.println("=======================");
    }
}