package java_basic.poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal) { // 다형적 참조 + 메서드 오버라이딩
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //  animal에 오버라이딩 된 함수가 실행된다.
        System.out.println("동물 소리 테스트 종료");
    }
}
