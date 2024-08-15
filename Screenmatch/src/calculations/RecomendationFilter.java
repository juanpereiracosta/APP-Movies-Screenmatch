package calculations;

public class RecomendationFilter {

    public void filter(Classification classificationMessage) {
        if (classificationMessage.getClassification() >= 4) {
            System.out.println("Among the best!");
        } else if (classificationMessage.getClassification() >= 2) {
            System.out.println("Highly rated at the moment!");
        } else {
            System.out.println("Add to the watchlist for later.");
        }
    }
}
