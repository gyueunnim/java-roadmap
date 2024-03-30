package java_start.loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while(count < 10) {
            System.out.println(num);
            count++;
            num += 2;
        }

        for(int i = 1; i <= 10; i++)
            System.out.println(i * 2);

    }
}
