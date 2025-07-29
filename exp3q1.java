public class exp3q1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 950; i++) {
            if (i % 6 == 0 && i % 9 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}