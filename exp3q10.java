import java.util.Scanner;

public class exp3q10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int K = 2;
        
        int n = arr.length;
        int[] rotatedArr = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + K) % n] = arr[i];
        }
        
        System.out.println("Rotated Array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}