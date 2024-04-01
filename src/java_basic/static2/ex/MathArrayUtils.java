package java_basic.static2.ex;

public class MathArrayUtils {
    public static int sum(int[] values) {
        int result = 0;
        for(int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result;
    }

    public static double average(int[] values) {
        double result = 0;
        for(int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result / values.length;
    }

    public static int min(int[] values) {
        int num = values[0];
        for(int i = 1; i < values.length; i++) {
            if(num > values[i])
                num = values[i];
        }
        return num;
    }

    public static int max(int[] values) {
        int num = values[0];
        for(int i = 1; i < values.length; i++) {
            if(num < values[i])
                num = values[i];
        }
        return num;
    }
}
