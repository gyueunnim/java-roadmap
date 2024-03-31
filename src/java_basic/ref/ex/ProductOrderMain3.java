package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[count];
        for(int i = 0; i < productOrders.length; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder p = new ProductOrder();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }
    public static void printOrders(ProductOrder[] orders) {
        for(int i = 0; i < orders.length; i++) {
            System.out.println("상품명: "+orders[i].productName+", 가격: "+orders[i].price+", 수량: "+orders[i].quantity);
        }
    }
    public static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for(int i = 0; i < orders.length; i++)
            total += (orders[i].price * orders[i].quantity);
        return total;
    }
}
