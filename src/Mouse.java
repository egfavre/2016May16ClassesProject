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
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    public Strain getStrain() {
        return strain;
    }

    public void setStrain(Strain newStrain) {
        strain = newStrain;
    }
    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String newCoatColor) {
        coatColor = newCoatColor;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String newDob) {
        dob = newDob;
    }

    public boolean getFemale(){
        return female;
    }
    public void setFemale(boolean newFemale){
        female = newFemale;
    }

    public boolean getMating(){
        return mating;
    }

    public void setMating(boolean newMating){
        mating = newMating;
    }

    public boolean isValidDob() {
        return dob.length() == 10;
    }

    public String starDob() {
        if (dob.length() == 10) {
            this.dob = dob + "*";
        }
        return dob;
    }
}