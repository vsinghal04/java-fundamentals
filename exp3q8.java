public class exp3q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        System.out.println("Copied Array: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}