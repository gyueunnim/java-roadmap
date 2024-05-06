package java_mid.lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value; // 오토 박싱 -> 컴파일 단계에서 추가

        int unboxedValue = boxedValue; // 오토 언박싱 -> 컴파일 단계에서 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
