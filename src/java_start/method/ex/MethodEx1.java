package java_start.method.ex;

public class MethodEx1 {
    public static double avg(int sum, int count) {
        return (double)sum / count;
    }
    public static void main(String[] args) {
        System.out.println(avg(1+2+3, 3));
        System.out.println(avg(15+25+35, 3));
    }
}
