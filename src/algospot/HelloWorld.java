package algospot;

import java.util.Scanner;

/**
 * 2. https://algospot.com/judge/problem/read/HELLOWORLD
 * 문제
 * - 예의 바른 프로그래머들은 인사를 잘 합니다. 프로그래밍 언어를 배우면서 처음으로 짜는 프로그램이 항상 Hello World! 인 것만 봐도 알 수 있지요. AOJ 의 첫 문제에서도 예외가 아닙니다. 인사할 사람들의 이름을 입력받고, 그들에게 각각 인사하는 프로그램을 짜 봅시다.
 * 입력
 * - 프로그램은 표준 입력에서 인사할 사람들의 이름을 입력받습니다. 입력의 첫 줄에는 사람의 수 C (1 <= C <= 50) 이 주어집니다. 그 후 한 줄에 하나씩 각 사람의 이름이 주어집니다. 각 사람의 이름은 알파벳 대소문자나 숫자로만 구성되어 있으며, 항상 50자 이하입니다.
 * 출력
 * - 한 줄에 하나씩, 입력에 주어진 순서대로 각 사람에게 인사 메시지를 출력합니다. 자세한 것은 예제 출력을 참조하세요.
 */
/*
예제 입력
5
World
Algospot
Illu
Jullu
Kodori

예제 출력
Hello, World!
Hello, Algospot!
Hello, Illu!
Hello, Jullu!
Hello, Kodori!
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count --> 0){
            String name = sc.next();
            System.out.println("Hello, " + name + "!");
        }
    }
}
