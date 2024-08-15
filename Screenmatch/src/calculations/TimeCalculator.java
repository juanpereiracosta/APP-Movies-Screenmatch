package calculations;

import models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }


    /*
    Ao invés de utilizar um método para cada classe [Movie e Series], podemos utilizar a superclasse [Title]
    que já engloba as duas, conforme está a seguir do bloco comentado

    public void titleInclusion(Movie movieToInclude) {
        totalTime += movieToInclude.getDurationInMinutes();
    }

    public void titleInclusion(Series seriesToInclude) {
        totalTime += seriesToInclude.getDurationInMinutes();
    }
    */

    public void titleInclusion(Title seriesToInclude) {
        totalTime += seriesToInclude.getDurationInMinutes();
    }
}
