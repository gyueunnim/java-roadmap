package java_mid.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        
        // 존재하지 않는 등급 -> String일 경우 오타가 발생하기 쉽고 유효하지 않는 값이 입력될 수 있음
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);

        // 타입 안정성 부족 + 데이터 일관성 떨어짐
        // 값의 제한 부족 + 컴파일 시 오류 감지 불가(런타임에서 발견 가능)
    }
}
