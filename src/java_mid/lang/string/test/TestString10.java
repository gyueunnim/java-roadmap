package java_mid.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] strings = fruits.split(",");
        for(String str : strings) {
            System.out.println(str);
        }
        System.out.println("joinedString = " + String.join("->", strings));
    }
}
