public class Giro extends Rekening{
    double limitPenarikan;

    public Giro (String pemilik, String norek, double saldo, double limit){
        super(pemilik, norek, saldo);
        limitPenarikan = limit;
    }
    
    public void  tarik (double jumlah){
        if (jumlah <= limitPenarikan){
            saldo -= jumlah;
        }else{
            System.out.println("Limit Penarikan Tidak Mencukupi");
        }
    }
}
