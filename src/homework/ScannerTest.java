package homework;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int n1 = scanner.nextInt();
        System.out.println("Second number: ");
        int n2 = scanner.nextInt();
        int tong = n1 + n2 ;
        int hieu = n1 - n2 ;
        int nhan = n1 * n2 ;
        float div = n1 / n2 ;
        float mod = n1 % n2 ;
        System.out.println( + (n1) + (" + ") + (n2) + (" = ") + tong );
        System.out.println( + (n1) + (" - ") + (n2) + (" = ") + hieu );
        System.out.println( + (n1) + (" x ") + (n2) + (" = ") + nhan );
        System.out.println( + (n1) + (" / ") + (n2) + (" = ") + div );
        System.out.println( + (n1) + (" mod ") + (n2) + (" = ") + mod );
    }
}
