package models;

import calculations.Classification;

public class Movie extends Title implements Classification {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public int getClassification() {
        return (int) (showMedia() / 2);
    }
}
