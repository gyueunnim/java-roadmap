package java_basic.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 20; // 컴파일 에러 -> final은 한번만 할당 가능

        final int data2 = 10;
//        data2 = 20; // 컴파일 에러
        method(10);

    }
    static void method(final int parameter) {
//        parameter = 20; // 컴파일 에러
    }
}
