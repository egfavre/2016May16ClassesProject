/**
 * Created by user on 5/16/16.
 */
public class House {
    boolean pups;
    boolean pathogenFree;
    String beddingType;
    String owner;
    String newOwner;

    public House (boolean pups, boolean pathogenFree, String beddingType) {
        this.pups = pups;
        this.pathogenFree = pathogenFree;
        this.beddingType = beddingType;
        owner = "dr Paulos";
    }

    public boolean getPups(){
        return pups;
    }

    public void setPups(boolean newPups){
        pups = newPups;
    }

    public boolean getPathogenFree() {
        return pathogenFree;
    }

    public void setPathogenFree(boolean newPathogenFree) {
        pathogenFree = newPathogenFree;
    }

    public String getBeddingType(){
        return beddingType;
    }

    public void setBeddingType(String newBeddingType){
        beddingType = newBeddingType;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String newOwner){
        owner = newOwner;
    }

    public String ifValidOwner() {
        if (owner.contains("dr")){
             newOwner = owner + "*";
        }
        else {
            newOwner = "dr. " + owner;
        }
        return newOwner;
    }
}