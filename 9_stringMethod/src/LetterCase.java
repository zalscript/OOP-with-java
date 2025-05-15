
import java.util.Scanner;

public class LetterCase {

    static class StringProcessor {
        private String teks;

        public StringProcessor(String teks) {
            this.teks = teks;
        }

        public String getteks() {
            return teks;
        }

        public void setteks(String teks) {
            this.teks = teks;
        }

        public String toUpperCase() {
            if (teks == null) {
                return null;
            }
            return teks.toUpperCase();
        }

        public String toLowerCase() {
            if (teks == null) {
                return null;
            }
            return teks.toLowerCase();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();

        StringProcessor processor = new StringProcessor(input);

        String hasilUpper = processor.toUpperCase();

        System.out.println("String asli: " + processor.getteks());
        System.out.println("String setelah diubah: " + hasilUpper);

        scanner.close();
    }
}
