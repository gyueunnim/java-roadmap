package java_mid2.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        
        // 타입 추론
//        result = GenericMethod.genericMethod(i);
//        integerValue = GenericMethod.numberMethod(10);
//        doubleValue = GenericMethod.numberMethod(20.0);
    }
}
