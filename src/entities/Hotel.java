package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Hotel {
    private String hotel_id;
    private String hotel_name;
    private String hotel_phone;
    private String hotel_email;
    private double hotel_rating;
    private String street;
    private String no;
    private String zip_code;

    public Hotel(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.hotel_id = rs.getString("hotel_id");
        this.hotel_name = rs.getString("hotel_name");
        this.hotel_phone = rs.getString("hotel_phone");
        this.hotel_email = rs.getString("hotel_email");
        this.hotel_rating = rs.getDouble("hotel_rating");
        this.street = rs.getString("street");
        this.no = rs.getString("no");
        this.zip_code = rs.getString("zip_code");
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_phone() {
        return hotel_phone;
    }

    public void setHotel_phone(String hotel_phone) {
        this.hotel_phone = hotel_phone;
    }

    public String getHotel_email() {
        return hotel_email;
    }

    public void setHotel_email(String hotel_email) {
        this.hotel_email = hotel_email;
    }

    public double getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(double hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
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
