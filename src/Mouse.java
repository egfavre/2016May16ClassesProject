/**
 * Created by user on 5/16/16.
 */
public class Mouse {
    String name;
    Strain strain;
    String coatColor;
    String dob;
    boolean female;
    boolean mating;
    int dobLength;

    public Mouse(String name, Strain strain, String coatColor, String dob, boolean female, boolean mating) {
        this.name = name;
        this.strain = strain;
        this.coatColor = coatColor;
        this.dob = dob;
        this.female = female;
        this.mating = mating;
    }

    public String getDob() {

        return dob;
    }

    public void setDob(String newDob) {

        dob = newDob;
    }

    public boolean isValidDob() {

        return dob.length() == 10;
    }

    public String starDob(String newDob) {
        if (newDob.length() == 10) {
            dob = newDob + "*";
        }
        return dob;
    }
}