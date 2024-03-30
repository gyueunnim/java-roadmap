package java_start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String name;
        int price;
        int quantity;
        int total = 0;
        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    name = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("구매 수량을 입력하세요: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("상품명:"+name+" 가격:"+price+" 수량:"+quantity+" 합계:"+(price*quantity));
                    total += (price*quantity);
                    break;
                case 2:
                    System.out.println("총 비용: " + total);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }

    }
}
