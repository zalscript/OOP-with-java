import java.util.Scanner;

public class StudyCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();

        String hasilUpper = input.toUpperCase();

        System.out.println("String asli: " + input);
        System.out.println("String setelah diubah: " + hasilUpper);

        scanner.close();
    }
}
