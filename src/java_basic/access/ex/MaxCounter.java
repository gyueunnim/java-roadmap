package java_basic.access.ex;

public class MaxCounter {
    private int count;
    private int max;
    MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }
    public void increment() {
        if(count < max)
            this.count += 1;
        else
            System.out.println("최댓값에 도달했습니다.");
    }

    public int getCount() {
        return count;
    }
}
