package java_mid.lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; // 문자열은 매우 자주 사용된다. 편의상 이렇게 사용해도 밑처럼 자동으로 바꿔준다.
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
