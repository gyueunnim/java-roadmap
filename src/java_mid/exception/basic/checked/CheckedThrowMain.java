package java_mid.exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
//        service.callThrow(); // 예외를 던지므로 따로 처리가 필요하다.
        try {
            service.callThrow();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("정상 종료");
    }
}
