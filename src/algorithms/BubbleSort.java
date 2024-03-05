package algorithms;

public class BubbleSort {

    static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Integer> nums = new java.util.ArrayList<Integer>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements to enter: ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums.size() - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }
        System.out.println(nums);

    }
}
