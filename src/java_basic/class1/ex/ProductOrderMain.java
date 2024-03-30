package java_basic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrder = new ProductOrder[3];
        int totalPrice = 0;

        ProductOrder p1 = new ProductOrder();
        p1.productName = "두부";
        p1.price = 2000;
        p1.quantity = 2;
        ProductOrder p2 = new ProductOrder();
        p2.productName = "김치";
        p2.price = 5000;
        p2.quantity = 1;
        ProductOrder p3 = new ProductOrder();
        p3.productName = "콜라";
        p3.price = 1500;
        p3.quantity = 2;

        productOrder[0] = p1;
        productOrder[1] = p2;
        productOrder[2] = p3;

        for(ProductOrder product: productOrder) {
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
            totalPrice += (product.price * product.quantity);
        }
        System.out.println("총 결제 금액: "+totalPrice);
    }
}
