package java_basic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    ShoppingCart() {
        this.itemCount = 0;
    }
    public void addItem(Item item) {
        if (itemCount < 10)
            this.items[itemCount++] = item;
        else
            System.out.println("장바구니 초과");
    }

    public void displayItems() {
        int totalAmount = 0;
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++) {
            totalAmount += (items[i].getPrice() * items[i].getQuantity());
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + (items[i].getPrice() * items[i].getQuantity()));
        }
        System.out.println("전체 가격 합: "+totalAmount);
    }
}
