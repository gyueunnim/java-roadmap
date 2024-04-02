package java_basic.poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};
        for(Animal animal: animalArr) {
            soundAnimal(animal);
        }

        // 추상 클래스로 대체
//        Animal animal1 = new Animal();
//        animal1.sound();
    }
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
