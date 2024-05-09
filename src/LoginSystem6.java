import java.util.Scanner;

public class LoginSystem6 {
    private static final String CORRECT_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            login(username, password);
            System.out.println("Login successful!");
            // Proceed with further actions after successful login
        } catch (IncorrectPasswordException e) {
            System.out.println("Incorrect password. Please try again.");
        }

        scanner.close();
    }

    public static void login(String username, String password) throws IncorrectPasswordException {
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new IncorrectPasswordException();
        }
        // Perform login process if the password is correct
    }
}

class IncorrectPasswordException extends Exception {
    // Custom exception for indicating an incorrect password
}
