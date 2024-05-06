package java_mid.lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoArray;
    private int count;

    public int[] generate() {
        lottoArray = new int[6];
        count = 0;
        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if(isUnique(number)) {
                lottoArray[count++] = number;
            }
        }
        return lottoArray;
    }

    private boolean isUnique(int number) {
        for(int i = 0; i < count; i++) {
            if(lottoArray[i] == number) {
                return false;
            }
        }
        return true;
    }
}
