package java_mid.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }
//    문자열 비교는 항상 equals()를 사용해서 동등성 비교를 해야한다!
    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
