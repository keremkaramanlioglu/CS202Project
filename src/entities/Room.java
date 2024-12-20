package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Room {
    private Object room_id;
    private Object hotel_id;
    private Object room_num;
    private Object room_type;
    private Object room_size;
    private Object room_price;
    private Object room_capacity;

    public Room(ResultSet rs) throws SQLException {   //  TODO : ADD TRY BLOCK
        this.room_id = rs.getObject("room_id");
        this.hotel_id = rs.getObject("hotel_id");
        this.room_num = rs.getObject("room_num");
        this.room_type = rs.getObject("room_type");
        this.room_size = rs.getObject("room_size");
        this.room_price = rs.getObject("room_price");
        this.room_capacity = rs.getObject("room_capacity");
    }

    public Room(Object[] obj) {
        if (obj.length == 7) {
            this.room_id = obj[0];
            this.hotel_id = obj[1];
            this.room_num = obj[2];
            this.room_type = obj[3];
            this.room_size = obj[4];
            this.room_price = obj[5];
            this.room_capacity = obj[6];
        } else {
            this.room_id = null;
            this.hotel_id = obj[0];
            this.room_num = obj[1];
            this.room_type = obj[2];
            this.room_size = obj[3];
            this.room_price = obj[4];
            this.room_capacity = obj[5];
        }
    }

    public Object getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Object room_id) {
        this.room_id = room_id;
    }

    public Object getRoom_num() {
        return room_num;
    }

    public void setRoom_num(Object room_num) {
        this.room_num = room_num;
    }

    public Object getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Object hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Object getRoom_type() {
        return room_type;
    }

    public void setRoom_type(Object room_type) {
        this.room_type = room_type;
    }

    public Object getRoom_size() {
        return room_size;
    }

    public void setRoom_size(Object room_size) {
        this.room_size = room_size;
    }

    public Object getRoom_price() {
        return room_price;
    }

    public void setRoom_price(Object room_price) {
        this.room_price = room_price;
    }

    public Object getRoom_capacity() {
        return room_capacity;
    }

    public void setRoom_capacity(Object room_capacity) {
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
