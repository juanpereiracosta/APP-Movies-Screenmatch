package main;

import models.Movie;
import models.Series;
import models.Title;

import java.util.ArrayList;

public class MainLists {

    public static void main(String[] args) {

        Movie movie1 = new Movie("The Godfather", 1972);
        movie1.review(5);
        Movie movie2 = new models.Movie("Die Hard", 1983);
        movie2.review(9);
        Movie movie3 = new Movie("Trainspotting", 1996);
        movie3.review(8);
        Series series1 = new Series("Sopranos", 1997);
        series1.review(6);
        Series series2 = new Series("Ozark", 2018);
        series2.review(9);
        Series series3 = new Series("Mad Men", 2010);
        series3.review(8);

        ArrayList<Title> titlesList = new ArrayList<>();
        titlesList.add(movie1);
        titlesList.add(movie2);
        titlesList.add(movie3);
        titlesList.add((series1));
        titlesList.add((series2));
        titlesList.add((series3));

        for (Title title : titlesList) {
            System.out.println(title);
            if (title instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classification: " + movie.getClassification());
            }
        }
    }
}

