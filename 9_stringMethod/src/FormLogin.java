
import java.util.Scanner;

public class FormLogin {

    static class User {
        String username;
        String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    static class LoginValidator {

        public LoginValidator() {
        }

        public boolean isValidUsername(String username) {
            // Validasi username harus mengandung '@'
            return username != null && username.contains("@");
        }

        public boolean isValidPassword(String password) {
            // Validasi password minimal 6 karakter dan mengandung angka
            return password != null && password.length() >= 6 && password.matches(".*[0-9].*");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginValidator validator = new LoginValidator();

        System.out.print("Masukkan username (email): ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        User user = new User(username, password);

        boolean validUsername = validator.isValidUsername(user.getUsername());
        boolean validPassword = validator.isValidPassword(user.getPassword());

        if (validUsername && validPassword) {
            System.out.println("Login berhasil. Selamat datang, " + user.getUsername() + "!");
        } else {
            System.out.println("Username atau password salah.");
            if (!validUsername) {
                System.out.println("* Username harus mengandung '@'.");
            }
            if (!validPassword) {
                System.out.println("* Password harus minimal 6 karakter dan mengandung angka.");
            }
        }

        scanner.close();
    }
}

