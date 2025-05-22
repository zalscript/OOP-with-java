import java.util.Map;
import java.util.HashMap;

public class Gudang <T> {
    private Map<T, Item <T>> barang;

    public Gudang () {
        barang = new HashMap<> ();
    }

    public void addItem (Item<T> item) {
        barang.put (item.getCode(), item);
        System.out.println(item.getName() + " berhasil ditambahkan!!");
    }

    public void removeItem (T code) {
        if (barang.containsKey(code)) {
            System.out.println (barang.get(code).getName() + "Item berhasil dihapus!!");
            barang.remove(code);
        }
        else {
            System.out.println(code + " tidak ditemukan!!");
        }
    }

    public void addStock (T code, int total) {
        if (barang.containsKey(code)) {
            barang.get(code).getStock();
            System.out.println("Stok " + barang.get(code).getName() + " berhasil ditambahkan!!");
        }
    }

    public void removeStock (T code, int total) {
        if (barang.containsKey(code)) {
            barang.get(code).removeStock(total);
            System.out.println("Stok " + barang.get(code).getName() + " berhasil dikurangi!!");
        }
        else {
            System.out.println("Kode barang tidak ditemukan!!");
        }
    }

    public void println () {
        for (Item <T> item : barang.values()) {
            item.infoItem();
        }
    }


}
