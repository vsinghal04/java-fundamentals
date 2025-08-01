public class exp3q6 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 7, 2, 8};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Second largest element: " + secondLargest);
    }
}