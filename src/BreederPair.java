/**
 * Created by user on 5/16/16.
 */
public class BreederPair {
    String monthPaired;
    String monthSeparated;
    int numberLitters;
    double avgNumberPups;
    boolean validNumLitters;

    public BreederPair(String monthPaired, String monthSeparated, int numberLitters, double avgNumberPups) {
        this.monthPaired = monthPaired;
        this.monthSeparated = monthSeparated;
        this.numberLitters = numberLitters;
        this.avgNumberPups = avgNumberPups;
    }

    public String getMonthPaired(){
        return monthPaired;
    }

    public void setMonthPaired(String newMonthPaired){
        monthPaired = newMonthPaired;
    }

    public String getMonthSeparated(){
        return monthSeparated;
    }

    public void setMonthSeparated(String newMonthSeparated){
        monthSeparated = newMonthSeparated;
    }

    public int getNumberLitters() {
        return numberLitters;
    }

    public void setNumberLitters(int newNumberLitters) {
        numberLitters = newNumberLitters;
    }

    public double getAvgNumberPups(){
        return avgNumberPups;
    }

    public void setAvgNumberPups(double newAvgNumberPups){
        avgNumberPups = newAvgNumberPups;
    }

    public boolean isValidNumberLitters() {
        validNumLitters = numberLitters < 10;
        return validNumLitters;
    }
}