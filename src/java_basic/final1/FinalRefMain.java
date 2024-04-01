package java_basic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // final 변경 불가

        data.value = 10; // 팜조 대상의 값은 변경 가능
        System.out.println(data.value);
        
        data.value = 20;
        System.out.println(data.value);
    }
}
