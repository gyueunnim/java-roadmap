package java_mid.enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
    
    private ClassGrade() { } // 외부에서 접근할 수 없도록 생성자 추가
}
