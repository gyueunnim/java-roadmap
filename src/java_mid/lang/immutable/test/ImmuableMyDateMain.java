package java_mid.lang.immutable.test;

public class ImmuableMyDateMain {
    public static void main(String[] args) {
        ImmuableMyDate date1 = new ImmuableMyDate(2024, 1, 1);
        ImmuableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
//        date1 = date1.setYear(2025);
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
