package java_basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

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
