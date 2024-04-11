package java_mid.lang.immutable.test;

public class ImmuableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public ImmuableMyDate setYear(int year) {
//        return new ImmuableMyDate(year, this.month, this.day);
//    }

    public ImmuableMyDate withYear(int newYear) {
        return new ImmuableMyDate(newYear, month, day);
    }

    public ImmuableMyDate withMonth(int newMonth) {
        return new ImmuableMyDate(newMonth, month, day);
    }

    public ImmuableMyDate withDay(int newDay) {
        return new ImmuableMyDate(newDay, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
