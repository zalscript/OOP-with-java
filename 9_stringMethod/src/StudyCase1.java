import java.util.Scanner;

public class StudyCase1 {

    static class LoginValidator {
        public boolean isValidUsername(String username) {
            // Contoh validasi sederhana: username harus mengandung '@'
            return username != null && username.contains("@");
        }

        public boolean isValidPassword(String password) {
            // Contoh validasi sederhana: password minimal 6 karakter
            return password != null && password.length() >= 6;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginValidator validator = new LoginValidator();

        System.out.print("Masukkan username (email): ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        boolean validUsername = validator.isValidUsername(username);
        boolean validPassword = validator.isValidPassword(password);

        if (validUsername && validPassword) {
            System.out.println("Login berhasil. Selamat datang, " + username + "!");
        } else {
            System.out.println("Login gagal. Periksa username dan password Anda.");
            if (!validUsername) {
                System.out.println("- Username harus mengandung '@'.");
            }
            if (!validPassword) {
                System.out.println("- Password harus minimal 6 karakter.");
            }
        }

        scanner.close();
    }
}
