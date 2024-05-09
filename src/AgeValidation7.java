import java.util.Scanner;

public class AgeValidation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid.");
            // Proceed with further actions if age is valid
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
