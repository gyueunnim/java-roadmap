package java_basic.construct;
// 기본 생성자 테스트 - 생성자는 반드시 호출되어야 한다.
public class MemberDefault {
    String name;

    // 기본 생성자는 자바에서 자동으로 생성해준다.
    // 기본 생성자를 직접 정의해도 된다
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
