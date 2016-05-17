/**
 * Created by user on 5/16/16.
 */
public class Room {
    int roomNumber;
    boolean lightCycleStandard;
    boolean microisolationCages;
    String technicianName;


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

    public static boolean isValidTechName(String technicianName) {
        return technicianName.contains(" ");
    }
}