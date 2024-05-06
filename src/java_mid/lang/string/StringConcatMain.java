package java_mid.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
//        문자열을 더할 땐 concat을 사용해야 하지만 String은 특별히 + 연산을 제공한다.
    }
}
