package java_mid.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
//        가능
//        Object dog = new Dog();
//        Object car = new Car();
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound();
//        obj.move();

        // 객체에 맞는 다운캐스팅 필요 -> Object를 활용한 다형성의 한계!
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
