package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = new int[100];
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
        boolean found = false;
        int pos = 0;
        for (int num : nums) {
            if (num == key) {
                found = true;
                break;
            }
            pos++;
        }
        if (found)
            System.out.println(key + " found at index " + pos);
        else
            System.out.println("The entered key was not found in array.");

    }
}
