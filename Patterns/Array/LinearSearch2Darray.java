import java.util.Scanner;

public class LinearSearch2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of array");
        int rows = sc.nextInt();
        System.out.println("Enter col of array");
        int col = sc.nextInt();
        int[][] array = new int[rows][col];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // col
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element " + i + " " + j);
                array[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
