package homework;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int n1 = scanner.nextInt();
        System.out.println("Second number: ");
        int n2 = scanner.nextInt();
        System.out.println( + (n1) + (" + ") + (n2) + (" = ") + ((n1)+(n2)));
        System.out.println( + (n1) + (" - ") + (n2) + (" = ") + ((n1)-(n2)));
        System.out.println( + (n1) + (" x ") + (n2) + (" = ") + ((n1)*(n2)));
        System.out.println( + (n1) + (" / ") + (n2) + (" = ") + ((n1)/(n2)));
        System.out.println( + (n1) + (" mod ") + (n2) + (" = ") + ((n1)%(n2)));
    }
}
