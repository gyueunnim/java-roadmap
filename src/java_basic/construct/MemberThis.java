package java_basic.construct;

public class MemberThis {
    String nameField;
    void initMember(String nameParameter) {
        nameField = nameParameter;
//        this.nameField = nameParameter; // this는 꼭 필요한 경우에만 사용해도 충분!
    }
}
