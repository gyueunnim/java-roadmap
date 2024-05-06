package java_mid.lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
//        String은 문자열 풀을 통해 최적화를 하기 때문에 불변 객체. 새로운 String을 리턴한다.
    }
}
