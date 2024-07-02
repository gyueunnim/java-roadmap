package java_mid2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        // integerBox.set("문자 100"); // Integer 타입만 허용된다. -> 컴파일 에러
        Integer integer = integerBox.get(); // 캐스팅 필요 X
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 가능 : 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
    
}
