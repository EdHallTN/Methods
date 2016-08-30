/**
 * Created by EdHall on 8/29/16.
 * Manages hotel room configurations.
 */
public class Room {

    private String bedType;
    private int occupancy;
    private int floor;
    private boolean hasBalcony;
    private boolean nonSmoking;


    public Room(String bedType, int occupancy, int floor, boolean hasBalcony, boolean nonSmoking) {

        this.bedType = bedType;
        this.occupancy = occupancy;
        this.floor = floor;
        this.hasBalcony = hasBalcony;
        this.nonSmoking = nonSmoking;

    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupany(int occupancy) {
        this.occupancy = occupancy;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor < 1)    {
            this.floor = floor;
        }
    }
    public boolean gethasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean getnonSmoking() {
        return nonSmoking;
    }

    public void setNonSmoking(boolean nonSmoking) {
        this.nonSmoking = nonSmoking;
    }


}