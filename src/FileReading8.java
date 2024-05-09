import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading8 {
    public static void main(String[] args) {
        try {
            readFromFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure the file exists.");
        }
    }

    public static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}
