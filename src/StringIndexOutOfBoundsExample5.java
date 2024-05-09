public class StringIndexOutOfBoundsExample5 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        try {
            // Trying to access an index that is beyond the length of the string
            char ch = str.charAt(20); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
