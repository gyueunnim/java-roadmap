package java_mid.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " +  (endTime - startTime) + "ms");

        // 래퍼 클래스
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");
        
//        primitive 기본형 연산이 래퍼 클래스보다 훨씬 빠르다.
//        prmitive는 4바이트 메모리, 래퍼 클래스는 8~16바이트 메모리를 추가로 사용한다.
//        CPU 연산을 아주 많이 수행하는 경우, 최적화를 고려한다.
//        그렇지 않은 일반적인 경우는 유지보수성을 고려하여 선택한다.
//        권장하는 방법은 개발 이후에 성능 테스트를 해보고 문제가 되는 부분을 찾아 최적화하는 것이다.
    }
}
