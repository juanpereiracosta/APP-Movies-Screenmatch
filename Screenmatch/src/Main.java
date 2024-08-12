public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie();

        movie1.setName("The Godfather");
        movie1.setYearOfRelease(1972);
        movie1.setDurationInMinutes(175);

        movie1.showTechnicalSheet();

        movie1.review(8);
        movie1.review(5);
        movie1.review(10);

        System.out.println("Total number of reviews: " + movie1.getTotalReviews());
        System.out.println(movie1.showMedia());
    }
}
