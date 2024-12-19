package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Room {
    private int room_id;
    private int hotel_id;
    private String room_num;
    private String room_type;
    private int room_size;
    private double room_price;
    private String room_capacity;

    public Room(ResultSet rs) throws SQLException {   //  TODO : ADD TRY BLOCK
        this.room_id = rs.getInt("room_id");
        this.hotel_id = rs.getInt("hotel_id");
        this.room_num = rs.getString("room_num");
        this.room_type = rs.getString("room_type");
        this.room_size = rs.getInt("room_size");
        this.room_price = rs.getDouble("room_price");
        this.room_capacity = rs.getString("room_capacity");
    }

    public Room(Object[] obj) {
        this.room_id = Integer.parseInt(String.valueOf(obj[0]));
        this.hotel_id = Integer.parseInt(String.valueOf(obj[1]));
        this.room_num = String.valueOf(obj[2]);
        this.room_type = String.valueOf(obj[3]);
        this.room_size = Integer.parseInt(String.valueOf(obj[4]));
        this.room_price = Double.parseDouble(String.valueOf(obj[5]));
        this.room_capacity = String.valueOf(obj[6]);
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getRoom_size() {
        return room_size;
    }

    public void setRoom_size(int room_size) {
        this.room_size = room_size;
    }

    public double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }

    public String getRoom_capacity() {
        return room_capacity;
    }

    public void setRoom_capacity(String room_capacity) {
        this.room_capacity = room_capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", hotel_id=" + hotel_id +
                ", room_num='" + room_num + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_size=" + room_size +
                ", room_price=" + room_price +
                ", room_capacity='" + room_capacity + '\'' +
                '}';
    }
}
