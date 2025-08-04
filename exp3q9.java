import java.util.Scanner;

public class exp3q9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4};
        int n = arr.length + 1;
        
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum -= num;
        }
        
        System.out.println("Missing number: " + sum);
    }
}