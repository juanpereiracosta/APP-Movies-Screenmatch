package models;

public class Title {
    String name;
    int yearOfRelease;
    private boolean includedInThePlan;
    private double sumReviews;
    private int totalReviews;
    private int durationInMinutes;

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showTechnicalSheet() {
        System.out.println("Name: " + name);
        System.out.println("Year Of Release: " + yearOfRelease);
        System.out.println("Duration In Minutes: " + durationInMinutes);
        System.out.println("**************************");
    }

    public void review(double grade) {
        sumReviews += grade;
        totalReviews ++;
    }

    public double showMedia() {
        return sumReviews / totalReviews;
    }
}
