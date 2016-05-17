/**
 * Created by user on 5/16/16.
 */
public class BreederPair {
    String monthPaired;
    String monthSeparated;
    int numberLitters;
    double avgNumberPups;

    public BreederPair(String monthPaired, String monthSeparated, int numberLitters, double avgNumberPups) {
        this.monthPaired = monthPaired;
        this.monthSeparated = monthSeparated;
        this.numberLitters = numberLitters;
        this.avgNumberPups = avgNumberPups;
    }

    public int getNumberLitters() {
        return numberLitters;
    }

    public void setNumberLitters(int newNumberLitters) {
        numberLitters = newNumberLitters;
    }

    public static boolean isValidNumberLitters(int numberLitters) {
        return numberLitters < 10;
    }

}