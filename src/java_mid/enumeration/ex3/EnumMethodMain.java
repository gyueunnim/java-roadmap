package java_mid.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for(Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }
        // ordinal은 가급적 사용하지 않는 것이 좋다ㄹ

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
