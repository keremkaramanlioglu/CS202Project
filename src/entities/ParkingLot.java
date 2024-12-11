package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ParkingLot {
    private int park_id;
    private int hotel_id;
    private int capacity;

    public ParkingLot(ResultSet rs) throws SQLException {
        this.park_id = rs.getInt("park_id");
        this.hotel_id = rs.getInt("hotel_id");
        this.capacity = rs.getInt("capacity");
    }

    public int getPark_id() {
        return park_id;
    }

    public void setPark_id(int park_id) {
        this.park_id = park_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "park_id=" + park_id +
                ", hotel_id=" + hotel_id +
                ", capacity=" + capacity +
                '}';
    }
}
