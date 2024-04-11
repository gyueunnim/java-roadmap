package java_mid.lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        Address b = new Address("서울") // 새로운 객체 참조
//        Address b = a // 기존 객체 공유 참조

    }
}
