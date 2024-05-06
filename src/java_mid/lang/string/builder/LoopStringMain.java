package java_mid.lang.string.builder;

// String result = str1 + str2;
// String result = new StringBuilder().append(str1).append(str2).toString();

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for(int i = 0; i < 100000; i++) {
            result += "Hello Java "; // 최적화가 이루어지지 않는다.
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
