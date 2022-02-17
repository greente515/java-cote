package algospot;

import java.util.Scanner;

/**
 * 1-1. Scanner Test
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases --> 0){
            String name = sc.next();
            System.out.println("Hello" + name );
        }
    }
}
