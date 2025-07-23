import java.util.Scanner;

public class coprime {
    public static int gcd(int a, int b) {
        while (b != 0) {  // Loop until remainder becomes 0
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.close(); // Close the scanner

        if (gcd(num1, num2) == 1) {
            System.out.println(num1 + " and " + num2 + " are Co-Prime.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Co-Prime.");
        }
    }
}
