package java_mid.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] strings = email.split("@");
        String id = strings[0];
        String domain = strings[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
