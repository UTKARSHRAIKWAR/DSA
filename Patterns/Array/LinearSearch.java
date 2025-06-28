import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter Elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter search Element");
        int searchItem = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchItem) {
                System.out.println("Found in index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
        sc.close();
    }
}
