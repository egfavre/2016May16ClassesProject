/**
 * Created by user on 5/16/16.
 */
public class House {
    boolean pups;
    boolean pathogenFree;
    String beddingType;
    String owner;

    public House (boolean pups, boolean pathogenFree, String beddingType) {
        this.pups = pups;
        this.pathogenFree = pathogenFree;
        this.beddingType = beddingType;
        owner = "dr Paulos";
    }


    public boolean getPathogenFree() {
        return pathogenFree;
    }

    public void setPathogenFree(boolean newPathogenFree) {
        pathogenFree = newPathogenFree;
    }

    public String ifValidOwner() {
        if (owner.contains("dr")){
            owner = owner + "*";}
            return owner;
    }
}




