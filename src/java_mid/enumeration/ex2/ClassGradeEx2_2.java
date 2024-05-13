package java_mid.enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        ClassGrade newClassFrade = new ClassGrade();
        int result = discountService.discount(newClassFrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/
        // 타입 안정성 향상, 데이터 일관성
        // 제한된 인스턴스 생성, 타입 안전성

        // 하지만 많은 코드를 작성해야 한다는 단점이 있음

    }
}
