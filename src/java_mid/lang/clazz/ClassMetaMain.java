package java_mid.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) {
//        Class 조회
        Class clazz = String.class; // 클래스에서 조회
//        Class clazz = new String().getClass(); // 인스턴스에서 조회
//        Class clazz = Class.forName("java.lang.String"); // 문자열로 조회

        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName()
            );
        }

        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println("Method: " + method);
        }

        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for(Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }
    }
}
