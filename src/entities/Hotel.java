package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Hotel {
    private Object hotel_id;
    private Object hotel_name;
    private Object hotel_phone;
    private Object hotel_email;
    private Object hotel_rating;
    private Object street;
    private Object no;
    private Object zip_code;

    public Hotel(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.hotel_id = rs.getObject("hotel_id");
        this.hotel_name = rs.getObject("hotel_name");
        this.hotel_phone = rs.getObject("hotel_phone");
        this.hotel_email = rs.getObject("hotel_email");
        this.hotel_rating = rs.getObject("hotel_rating");
        this.street = rs.getObject("street");
        this.no = rs.getObject("no");
        this.zip_code = rs.getObject("zip_code");
    }

    public Hotel(int hotel_id, String hotel_name, String hotel_phone, String hotel_email, double hotel_rating, String street, String no, String zip_code) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_phone = hotel_phone;
        this.hotel_email = hotel_email;
        this.hotel_rating = hotel_rating;
        this.street = street;
        this.no = no;
        this.zip_code = zip_code;
    }

    public Hotel(Object[] obj) {
        if (obj.length == 8) {
            this.hotel_id = obj[0];
            this.hotel_name = obj[1];
            this.hotel_phone = obj[2];
            this.hotel_email = obj[3];
            this.hotel_rating = obj[4];
            this.street = obj[5];
            this.no = obj[6];
            this.zip_code = obj[7];
        } else {
            this.hotel_id = null;
            this.hotel_name = obj[0];
            this.hotel_phone = obj[1];
            this.hotel_email = obj[2];
            this.hotel_rating = obj[3];
            this.street = obj[4];
            this.no = obj[5];
            this.zip_code = obj[6];
        }
    }

    public Object getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Object hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Object getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(Object hotel_name) {
        this.hotel_name = hotel_name;
    }

    public Object getHotel_phone() {
        return hotel_phone;
    }

    public void setHotel_phone(Object hotel_phone) {
        this.hotel_phone = hotel_phone;
    }

    public Object getHotel_email() {
        return hotel_email;
    }

    public void setHotel_email(Object hotel_email) {
        this.hotel_email = hotel_email;
    }

    public Object getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(Object hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Object getNo() {
        return no;
    }

    public void setNo(Object no) {
        this.no = no;
    }

    public Object getZip_code() {
        return zip_code;
    }

    public void setZip_code(Object zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id='" + hotel_id + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_phone='" + hotel_phone + '\'' +
                ", hotel_email='" + hotel_email + '\'' +
                ", hotel_rating=" + hotel_rating +
                ", street='" + street + '\'' +
                ", no='" + no + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}
