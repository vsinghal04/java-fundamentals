public class exp3q7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("? ");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}