package java_mid.lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
//        메서드 체이닝은 자기 자신의 참조값을 반환하기 때문에 가능하다.
//        메서드 체이닝 기법을 통해 코드를 간결하고 읽기 쉽게 만든다.
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
