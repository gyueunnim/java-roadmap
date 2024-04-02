package java_basic.poly.ex3;

public abstract class AbstractAnimal { // abstract이므로 직접 인스턴스 생성 불가
    public abstract void sound();      // 추상 메서드 -> 반드시 오버라이딩 필요
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
