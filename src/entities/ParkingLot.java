package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ParkingLot {
    private Object park_id;
    private Object hotel_id;
    private Object capacity;

    public ParkingLot(ResultSet rs) throws SQLException {
        this.park_id = rs.getObject("park_id");
        this.hotel_id = rs.getObject("hotel_id");
        this.capacity = rs.getObject("capacity");
    }

    public ParkingLot(Object[] obj) {
        this.park_id = obj[0];
        this.hotel_id = obj[1];
        this.capacity = obj[2];
    }

    public Object getPark_id() {
        return park_id;
    }

    public void setPark_id(Object park_id) {
        this.park_id = park_id;
    }

    public Object getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Object hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Object getCapacity() {
        return capacity;
    }

    public void setCapacity(Object capacity) {
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
