package algorithms;

public class BinarySearch {
    static int[] nums = new int[100];

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int key = scanner.nextInt();
        scanner.close();
        int high = n - 1, low = 0, mid = -1;
        boolean found = false;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == key) {
                found = true;
                break;
            } else if (nums[mid] > key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found)
            System.out.println("Found " + key + " at index " + mid);
        else
            System.out.println("Number was not found in the array.");
    }
}
