import java.util.Scanner;

public class exp3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int N = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        sc.close();
    }
}