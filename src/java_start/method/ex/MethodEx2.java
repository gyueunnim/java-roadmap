package java_start.method.ex;

public class MethodEx2 {
    public static void printString(String message, int count) {
        for(int i = 0; i < count; i++)
            System.out.println(message);
    }
    public static void main(String[] args) {
        String message = "Hello world!";
        printString(message, 3);
        printString(message, 5);
        printString(message, 7);
    }
}
