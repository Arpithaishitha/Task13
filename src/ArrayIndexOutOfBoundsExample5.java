public class ArrayIndexOutOfBoundsExample5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Trying to access an index that doesn't exist in the array
            System.out.println(numbers[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
