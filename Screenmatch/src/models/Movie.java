package models;

import calculations.Classification;

public class Movie extends Title implements Classification {
    private String Director;

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

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

    @Override
    public String toString() {
        return getName();
    }
}
