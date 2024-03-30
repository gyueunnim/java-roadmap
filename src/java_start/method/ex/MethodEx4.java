package java_start.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        int money;
        int sel;
        while(true) {
            printMenu();
            sel = scanner.nextInt();
            scanner.nextLine();

            switch (sel) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    balance = deposit(balance, money);
                    System.out.println(money+"원을 입금하였습니다. 현재 잔액: "+balance+"원");
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    money = scanner.nextInt();
                    scanner.nextLine();
                    if (money <= balance) {
                        balance = withdraw(balance, money);
                        System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
                    } else {
                        System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액: "+balance+"원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
            }
        }
    }

    public static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
        System.out.print("선택: ");
    }

    public static int deposit(int balance, int money) {
        return balance += money;
    }

    public static int withdraw(int balance, int money) {
        return balance -= money;
    }
}
