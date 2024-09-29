package class1;

public class MovieReviewmain2 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviewarr=new MovieReview[2];
        movieReviewarr[0]=movieReview1;
        movieReviewarr[1]=movieReview2;


//        System.out.println("영화제목: " + movieReview1.title + ", 영화 후기: " + movieReview1.review);
//        System.out.println("영화제목: " + movieReview2.title + ", 영화 후기: " + movieReview2.review);

        System.out.println("영화제목: " + movieReviewarr[0].title + ", 영화 후기: " + movieReviewarr[0].review);
        System.out.println("영화제목: " + movieReviewarr[1].title + ", 영화 후기: " + movieReviewarr[1].review);
    }
}
