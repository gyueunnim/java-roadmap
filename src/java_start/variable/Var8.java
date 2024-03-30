package java_start.variable;

public class Var8 {
    public static void main(String[] args) {
        byte b = 127; // 128 ~ 127
        short s;
        int i;
        long l; // 뒤에 대문자 L 넣어줘야

        float f; // 뒤에 f 붙여줘야
        double d;

        // 정수는 기본적으로 int로 계산
        // 따라서 리터럴 정수를 int로 생각한다. int의 길이를 넘어선다면 L을 붙여주자
        // 실수는 기본적으로 double로 계산
        // 따라서 리터럴 실수를 double로 생각한다. float을 사용한다면 f를 붙여주자.

        // 실무에서 거의 사용하지 않는 타입 -> 지금은 메모리 크기가 크기 때문에 바이트 타입 같은 것 효과 거의 없다
        // byte, short, float, char
        // 문자 하나를 쓸 때도 String 사용 가능
    }
}
