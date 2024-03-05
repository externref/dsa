package algorithms;

public class SelectionSort {
    static int nums[] = new int[100];

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                if (nums[j] < nums[min_idx])
                    min_idx = j;
            }
            if (min_idx != i)
                temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
