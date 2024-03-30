package java_start.cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = "+x+"는 "+result+"입니다.");
//        int x = 2;
//        if((x % 2 == 0)? true : false)
//            System.out.println("짝수");
//        else
//            System.out.println("홀수");

    }
}
