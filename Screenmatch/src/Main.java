import calculations.RecomendationFilter;
import calculations.TimeCalculator;
import models.Episode;
import models.Series;

public class Main {
    public static void main(String[] args) {

        models.Movie movie1 = new models.Movie();
        movie1.setName("The Godfather");
        movie1.setYearOfRelease(1972);
        movie1.setDurationInMinutes(175);
        movie1.showTechnicalSheet();
        movie1.review(8);
        movie1.review(5);
        movie1.review(10);

        models.Movie movie2 = new models.Movie();
        movie2.setName("Die Hard");
        movie2.setYearOfRelease(1983);
        movie2.setDurationInMinutes(164);
        movie2.showTechnicalSheet();

        System.out.println("Total number of reviews: " + movie1.getTotalReviews());
        System.out.println(movie1.showMedia());

        Series series1 = new Series();
        series1.setName("Sopranos");
        series1.setYearOfRelease(1997);
        series1.setSeasons(10);
        series1.setEpisodesPerSeason(10);
        series1.setMinutesPerEpisode(50);
        System.out.println("Total duration in minutes of the series: " + series1.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.titleInclusion(movie1);
        calculator.titleInclusion(movie2);
        calculator.titleInclusion(series1);
        System.out.println(calculator.getTotalTime());

        RecomendationFilter filter1 = new RecomendationFilter();
        filter1.filter(movie1);

        Episode episode1 = new Episode();
        episode1.setNumber(1);
        episode1.setSeries(series1);
        episode1.setTotalViews(300);
        filter1.filter(episode1);
    }
}
