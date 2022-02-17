package algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1-2. BufferedReader - Scaaner 보다 빠를 수 있다.
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //입력받을값이 String일때
        int a = br.read(); //입력받을값이 int일때
        int b = Integer.parseInt(br.readLine()); //int값+엔터 까지 입력받을때

        br.readLine();
        int t;
        long st2 = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            t = Integer.parseInt(br.readLine());
        }
        System.out.println("소요시간" + (System.currentTimeMillis() - st2) + "ms");
    }
}
