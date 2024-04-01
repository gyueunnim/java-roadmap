package java_basic.static2;

// import static java_basic.static2.DecoData.staticCall;
import static java_basic.static2.DecoData.*;    // 정적 메서드, 정적 변수에 사용 가능

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근

        DecoData data3 = new DecoData();
        data3.staticCall();         // 추천하지 않는다. 인스턴스 메서드에 접근하는 것처럼 보일 수 있다.

        DecoData.staticCall();      // 정적 메서드는 공용으로 관리하기 때문에 클래스를 통해 접근하는 것이 좋다.
    }
}
