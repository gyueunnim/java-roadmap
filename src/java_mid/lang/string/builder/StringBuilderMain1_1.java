package java_mid.lang.string.builder;

public class StringBuilderMain1_1 {
//    String은 내부에 final인 변경할 수 없는 byte[]를 가진다.
//    StringBuilder는 내부에 final이 아닌 변경할 수 있는 byte[]를 가진다.
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("A");
    sb.append("B");
    sb.append("C");
    sb.append("D");
    System.out.println("sb = " + sb);

    sb.insert(4, "Java");
    System.out.println("insert = " + sb);

    sb.delete(4, 8);
    System.out.println("delete = " + sb);

    sb.reverse();
    System.out.println("reverse = " + sb);

    String string = sb.toString();
    System.out.println("string = " + string);
//    StringBuilder는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 안전한(불변) String으로 변환하는 것이 좋다.
}
}
