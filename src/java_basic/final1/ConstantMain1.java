package java_basic.final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        // 최대 참여자 수를 1000명에서 2000명으로 증가시킬 경우 2곳의 변경 포인트 발생
        // 1000이라는 수의 의미 파악이 어려움
        System.out.println("프로그램 최대 참여자 수: " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if(currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }
}
