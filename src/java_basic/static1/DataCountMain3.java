package java_basic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("A");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("A");
        System.out.println("C count=" + Data3.count);

//        System.out.println(data3.count);    // 되긴 하는데 굳이?임

        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 추천하지 않음 -> 인스턴스 변수에 접근하는 것처럼 보일 수 있음

        System.out.println(Data3.count);
    }
}
