import java.util.Scanner;

public class GudangApp {

    public static void main(String[] args) {
        Gudang<String> gudang = new Gudang();
        Item<String> item1 = 
            new Item<String>("A001", "Sepatu Futsal", 250);
            gudang.addItem(
                new Item<String>("A002", "Sepatu Running", 200)
            );
            gudang.addItem(
                new Item<String>("A003", "Jersey Real Madrid", 300)
            );
            gudang.addItem(item1);

            gudang.addStock("A001", 275);
            gudang.println();
    }
}