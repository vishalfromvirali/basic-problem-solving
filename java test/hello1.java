import java.util.Arrays;

public class hello1 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the array in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}