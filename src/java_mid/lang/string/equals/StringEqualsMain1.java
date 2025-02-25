package java_mid.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));    // false
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));   // true
//        new 연산자는 서로 다른 인스턴스 생성

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true
//        = 연산자는 같은 인스턴스를 생성하여 가리킴(문자열 풀)
    }
}
