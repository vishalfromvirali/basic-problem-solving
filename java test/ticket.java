import java.util.Scanner;

public class ticket { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of tickets: ");
        int count = scanner.nextInt();

        int totalAmount = 0; 

        for (int i = 0; i < count; i++) {
            System.out.println("Enter the age for ticket " + (i + 1) + ": "); 
            int age = scanner.nextInt();

            int price;

            if (age > 60) {
                price = 30;
            } else if (age < 12) {
                price = 20;
            } else {
                price = 50; 
            }

            totalAmount += price; 
        }

        System.out.println("Total amount to be paid: Rs." + totalAmount);
    }
}