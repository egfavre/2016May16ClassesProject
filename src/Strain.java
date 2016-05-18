/**
 * Created by user on 5/16/16.
 */
public class Strain {
    String diet;
    int maturationAge;
    String vendor;
    double costPerMouse;

    public Strain(String diet, int maturationAge, String vendor, double costPerMouse) {
        this.diet = diet;
        this.maturationAge = maturationAge;
        this.vendor = vendor;
        this.costPerMouse = costPerMouse;
    }

    public static boolean isValidVendor(String vendor) {
        return vendor.contains("Jax");
    }

    public String getDiet(){
        return diet;
    }

    public void setDiet(String newDiet){
        diet = newDiet;
    }

    public int getMaturationAge() {
        return maturationAge;
    }

    public void setMaturationAge(int newMaturationAge) {
        maturationAge = newMaturationAge;
    }

    public String getVendor(){
        return vendor;
    }

    public void setVendor(String newVendor){
        vendor = newVendor;}

    public double getCostPerMouse() {
        return costPerMouse;
    }

    public void setCostPerMouse(double newCostPerMouse) {
        costPerMouse = newCostPerMouse;
    }
}