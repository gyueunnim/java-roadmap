package java_basic.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "seo"); // id 변경을 시도할 경우 컴파일 에러 발생
        member.print();
    }
}
