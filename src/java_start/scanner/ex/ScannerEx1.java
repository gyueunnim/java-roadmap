package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.print("당신의 이름을 입력하세요: ");
        name = scanner.nextLine();
        System.out.print("당신의 나이를 입력하세요: ");
        age = scanner.nextInt();

        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"입니다.");
    }
}
