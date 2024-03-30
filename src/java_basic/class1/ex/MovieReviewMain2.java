package java_basic.class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview m1 = new MovieReview();
        m1.title = "인셉션";
        m1.review = "인생은 무한 루프";
        MovieReview m2 = new MovieReview();
        m2.title = "어바웃 타임";
        m2.review = "인생 시간 영화!";

        MovieReview[] m = new MovieReview[2];
        m[0] = m1;
        m[1] = m2;

        for(int i = 0; i < m.length; i++)
            System.out.println("영화 제목: "+m[i].title+", 리뷰: "+m[i].review);
    }
}
