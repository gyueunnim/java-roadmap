package java_basic.access.b;

import java_basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        // default 불가
//        data.defaultField = 1;
//        data.defaultMethod();

        // private 불가
//        data.privateField = 1;
//        data.privateMethod();

        data.innerAccess();
    }
}
