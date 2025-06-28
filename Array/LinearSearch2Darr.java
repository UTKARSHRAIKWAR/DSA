import java.util.Scanner;

public class LinearSearch2Darr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of array");
        int rows = sc.nextInt();
        System.out.println("Enter col of array");
        int col = sc.nextInt();
        int[][] array = new int[rows][col];

        System.out.println("Enter element to be search");
        int searchItem = sc.nextInt();

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
                if (array[i][j] == searchItem) {
                    System.out.println("Element found in row " + i + " col " + j);
                } else {
                    System.out.println("Not found");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}