package java_mid.lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();

        System.out.print("로또 번호: ");
        for(int number : lottoNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
