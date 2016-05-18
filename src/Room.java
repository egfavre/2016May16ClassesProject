/**
 * Created by user on 5/16/16.
 */
public class Room {
    int roomNumber;
    boolean lightCycleStandard;
    boolean microisolationCages;
    String technicianName;
    boolean valid;


    public Room(int roomNumber, boolean lightCycleStandard, boolean microisolationCages, String technicianName) {
        this.roomNumber = roomNumber;
        this.lightCycleStandard = lightCycleStandard;
        this.microisolationCages = microisolationCages;
        this.technicianName = technicianName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int newRoomNumber) {
        roomNumber = newRoomNumber;
    }

    public boolean getLightCycleStandard(){
        return lightCycleStandard;
    }

    public void setLightCycleStandard(boolean newLightCycleStandard){
        lightCycleStandard = newLightCycleStandard;
    }

    public boolean getMicroisolationCages(){
        return microisolationCages;
    }

    public void setMicroisolationCages(boolean newMicroisolationCages){
        microisolationCages = newMicroisolationCages;
    }

    public String getTechnicianName(){
        return technicianName;
    }

    public void setTechnicianName(String newTechnicianName){
        technicianName = newTechnicianName;
    }

    public boolean isValidTechName() {
        boolean valid = technicianName.contains(" ");
        return valid;
    }
}