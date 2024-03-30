package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price;
        int quantity;

        while(true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            price = scanner.nextInt();
            if (price == -1)
                break;
            scanner.nextLine();
            System.out.print("구매하려는 수량을 입력하세요: ");
            quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("총 비용: " + (price*quantity));
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
