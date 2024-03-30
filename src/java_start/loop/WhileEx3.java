package java_start.loop;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        sum = 0;
        for(int j = 1; j <= max; j++)
            sum += j;
        System.out.println(sum);
    }
}
