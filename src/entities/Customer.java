package entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    private String c_ssn;
    private String c_firstname;
    private String c_lastname;
    private Date c_bd;
    private Integer c_room_id;
    private String c_email;
    private String c_phone_num;
    private String c_gender;
    private String zip_code;

    public Customer(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.c_ssn = rs.getString("c_ssn");
        this.c_firstname = rs.getString("c_firstname");
        this.c_lastname = rs.getString("c_lastname");
        this.c_bd = rs.getDate("c_bd");
        this.c_room_id = rs.getInt("c_room_id");
        this.c_email = rs.getString("c_email");
        this.c_phone_num = rs.getString("c_phone_num");
        this.c_gender = rs.getString("c_gender");
        this.zip_code = rs.getString("zip_code");
    }

    public Customer(Object[] obj) {
        this.c_ssn = String.valueOf(obj[0]);
        this.c_firstname = String.valueOf(obj[1]);
        this.c_lastname = String.valueOf(obj[2]);
        this.c_bd = Date.valueOf(String.valueOf(obj[3]));
        this.c_room_id = (String.valueOf(obj[4]).trim().isEmpty() ? null : Integer.parseInt(String.valueOf(obj[4])));
        this.c_email = String.valueOf(obj[5]);
        this.c_phone_num = String.valueOf(obj[6]);
        this.c_gender = String.valueOf(obj[7]);
        this.zip_code = String.valueOf(obj[8]);
    }

    public String getC_ssn() {
        return c_ssn;
    }

    public void setC_ssn(String c_ssn) {
        this.c_ssn = c_ssn;
    }

    public String getC_lastname() {
        return c_lastname;
    }

    public void setC_lastname(String c_lastname) {
        this.c_lastname = c_lastname;
    }

    public String getC_firstname() {
        return c_firstname;
    }

    public void setC_firstname(String c_firstname) {
        this.c_firstname = c_firstname;
    }

    public Date getC_bd() {
        return c_bd;
    }

    public void setC_bd(Date c_bd) {
        this.c_bd = c_bd;
    }

    public Integer getC_room_id() {
        return c_room_id;
    }

    public void setC_room_id(Integer c_room_id) {
        this.c_room_id = c_room_id;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public String getC_phone_num() {
        return c_phone_num;
    }

    public void setC_phone_num(String c_phone_num) {
        this.c_phone_num = c_phone_num;
    }

    public String getC_gender() {
        return c_gender;
    }

    public void setC_gender(String c_gender) {
        this.c_gender = c_gender;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "c_ssn='" + c_ssn + '\'' +
                ", c_firstname='" + c_firstname + '\'' +
                ", c_lastname='" + c_lastname + '\'' +
                ", c_bd=" + c_bd +
                ", c_room_id=" + c_room_id +
                ", c_email='" + c_email + '\'' +
                ", c_phone_num='" + c_phone_num + '\'' +
                ", c_gender='" + c_gender + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}
