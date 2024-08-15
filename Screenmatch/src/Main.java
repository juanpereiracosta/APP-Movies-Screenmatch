import calculations.RecomendationFilter;
import calculations.TimeCalculator;
import models.Episode;
import models.Movie;
import models.Series;

import java.util.ArrayList;

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
        System.out.println("Total number of reviews: " + movie1.getTotalReviews());
        System.out.println(movie1.showMedia());

        models.Movie movie2 = new models.Movie();
        movie2.setName("Die Hard");
        movie2.setYearOfRelease(1983);
        movie2.setDurationInMinutes(164);
        movie2.showTechnicalSheet();
        movie1.review(4);
        movie1.review(10);
        movie1.review(7);
        System.out.println("Total number of reviews: " + movie2.getTotalReviews());
        System.out.println(movie2.showMedia());

        Movie movie3 = new Movie();
        movie3.setName("Trainspotting");
        movie3.setYearOfRelease(1996);
        movie3.setDurationInMinutes(172);
        movie3.showTechnicalSheet();
        movie3.review(10);
        movie3.review(9);
        movie3.review(8);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        System.out.println("Quantidade de filmes na lista: " + movieList.size());
        System.out.println(movieList.get(0).getName());

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
