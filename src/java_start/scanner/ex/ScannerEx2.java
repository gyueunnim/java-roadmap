package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("입력한 숫자 "+num+"는 "+result+"입니다.");
    }
}
