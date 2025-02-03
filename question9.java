import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int num : array[i]) {
                sum += num;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i + 1;
            }
        }

        System.out.println("Row with the maximum sum: " + maxRow);
        System.out.println("Maximum sum: " + maxSum);

        sc.close();
    }
}
