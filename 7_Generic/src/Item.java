public class Item <T> {
    T code;
    String name;
    int stock;

public Item (T code, String name, int stock) {
    this.code = code;
    this.name = name;
    this.stock = stock;
    }

    public void setCode (T code) {
        this.code = code;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setStock (int stock) {
        this.stock = stock;
    }

    public T getCode () {
        return code;
    }

    public String getName () {
        return name;
    }

    public Integer getStock () {
        return stock;
    }

    public void addStock () {
        this.stock += stock;
        System.out.println(getName() + "Berhasil ditambahkan sebanyak " + stock + " unit!!" );
    }

    public void removeStock (int total) {
        if (stock <= this.stock) {
            this.stock -= total;
            System.out.println(getName() + " berhasil dikurangi sebanyak " + total + " unit!!");
        } else {
            System.out.println("Stok tidak mencukupi!!");
        }
    }

    public void infoItem () {
        System.out.println
        ("Kode: " + getCode() + 
        "Nama Barang: " + getName() + 
        "Stok: " + getStock()
        );
    }

}
