package entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    private Object c_ssn;
    private Object c_firstname;
    private Object c_lastname;
    private Object c_bd;
    private Object c_room_id;
    private Object c_email;
    private Object c_phone_num;
    private Object c_gender;
    private Object zip_code;

    public Customer(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.c_ssn = rs.getObject("c_ssn");
        this.c_firstname = rs.getObject("c_firstname");
        this.c_lastname = rs.getObject("c_lastname");
        this.c_bd = rs.getObject("c_bd");
        this.c_room_id = rs.getObject("c_room_id");
        this.c_email = rs.getObject("c_email");
        this.c_phone_num = rs.getObject("c_phone_num");
        this.c_gender = rs.getObject("c_gender");
        this.zip_code = rs.getObject("zip_code");
    }

    public Customer(Object[] obj) {
        this.c_ssn = obj[0];
        this.c_firstname = obj[1];
        this.c_lastname = obj[2];
        this.c_bd = obj[3];
        this.c_room_id = obj[4];
        this.c_email = obj[5];
        this.c_phone_num = obj[6];
        this.c_gender = obj[7];
        this.zip_code = obj[8];
    }

    public Object getC_ssn() {
        return c_ssn;
    }

    public void setC_ssn(Object c_ssn) {
        this.c_ssn = c_ssn;
    }

    public Object getC_lastname() {
        return c_lastname;
    }

    public void setC_lastname(Object c_lastname) {
        this.c_lastname = c_lastname;
    }

    public Object getC_firstname() {
        return c_firstname;
    }

    public void setC_firstname(Object c_firstname) {
        this.c_firstname = c_firstname;
    }

    public Object getC_bd() {
        return c_bd;
    }

    public void setC_bd(Object c_bd) {
        this.c_bd = c_bd;
    }

    public Object getC_room_id() {
        return c_room_id;
    }

    public void setC_room_id(Object c_room_id) {
        this.c_room_id = c_room_id;
    }

    public Object getC_email() {
        return c_email;
    }

    public void setC_email(Object c_email) {
        this.c_email = c_email;
    }

    public Object getC_phone_num() {
        return c_phone_num;
    }

    public void setC_phone_num(Object c_phone_num) {
        this.c_phone_num = c_phone_num;
    }

    public Object getC_gender() {
        return c_gender;
    }

    public void setC_gender(Object c_gender) {
        this.c_gender = c_gender;
    }

    public Object getZip_code() {
        return zip_code;
    }

    public void setZip_code(Object zip_code) {
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
