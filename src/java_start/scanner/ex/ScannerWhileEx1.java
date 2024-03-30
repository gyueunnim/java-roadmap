package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str;
            int age;
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            str = scanner.nextLine();
            if (str.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.print("나이를 입력하세요: ");
                age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("입력한 이름: " + str + ", 나이: " + age);
            }
        }
    }
}
