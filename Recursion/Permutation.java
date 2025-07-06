import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        printPer(str, "");

    }

    public static void printPer(String str, String Permutation) {
        if (str.length() == 0) {
            System.out.println(Permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPer(newStr, Permutation + currentChar);
        }
    }
}