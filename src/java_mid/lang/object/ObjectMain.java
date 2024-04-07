package java_mid.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드 - 객체의 정보 제공
        String string = child.toString();
        System.out.println(string);
    }
}
