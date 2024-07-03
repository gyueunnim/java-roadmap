package java_mid2.generic.ex4;

import java_mid2.generic.animal.Cat;
import java_mid2.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

        // 제너릭 타입보다 제니릭 메서드가 높은 우선순위를 가진다.
    }
}
