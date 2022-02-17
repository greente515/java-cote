package algospot;

import java.util.Scanner;

/**
 * psvm - java main method 생성하는 intelliJ 단축어
 * sout - System.out.println 실행하는 intelliJ 단축어
 * 문제
 * The administrators of algospot.com are so merciful, that they prepared really, really easy problem to prevent contestants from frustration.
 * 입력
 * Input contains just one positive integer N(N <= 10).
 * 출력
 * Print N lines. Every line should contain 'Hello Algospot!'(quotation marks for clarity) and nothing else.
 */
/*
예제 입력
2
예제 출력
Hello Algospot!
Hello Algospot!
 */
public class Mercy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count --> 0) {
            System.out.println("Hello Algospot!");
        }
    }
}
