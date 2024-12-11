package entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
    private String emp_ssn;
    private String emp_firstname;
    private String emp_lastname;
    private String emp_type;
    private String emp_bd;
    private Date years;
    private int emp_hotel_id;
    private double emp_salary;
    private String emp_phone_num;
    private String emp_email;
    private String emp_gender;
    private String street;
    private String no;
    private String apartment;
    private String zip_code;

    public Employee(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.emp_ssn = rs.getString("emp_ssn");
        this.emp_firstname = rs.getString("emp_firstname");
        this.emp_lastname = rs.getString("emp_lastname");
        this.emp_type = rs.getString("emp_type");
        this.emp_bd = rs.getString("emp_bd");
        this.years = rs.getDate("years");
        this.emp_hotel_id = rs.getInt("emp_hotel_id");
        this.emp_salary = rs.getDouble("emp_salary");
        this.emp_phone_num = rs.getString("emp_phone_num");
        this.emp_email = rs.getString("emp_email");
        this.emp_gender = rs.getString("emp_gender");
        this.street = rs.getString("street");
        this.no = rs.getString("no");
        this.apartment = rs.getString("apartment");
        this.zip_code = rs.getString("zip_code");
    }

    public String getEmp_ssn() {
        return emp_ssn;
    }

    public void setEmp_ssn(String emp_ssn) {
        this.emp_ssn = emp_ssn;
    }

    public String getEmp_firstname() {
        return emp_firstname;
    }

    public void setEmp_firstname(String emp_firstname) {
        this.emp_firstname = emp_firstname;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    public String getEmp_bd() {
        return emp_bd;
    }

    public void setEmp_bd(String emp_bd) {
        this.emp_bd = emp_bd;
    }

    public Date getYears() {
        return years;
    }

    public void setYears(Date years) {
        this.years = years;
    }

    public int getEmp_hotel_id() {
        return emp_hotel_id;
    }

    public void setEmp_hotel_id(int emp_hotel_id) {
        this.emp_hotel_id = emp_hotel_id;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_phone_num() {
        return emp_phone_num;
    }

    public void setEmp_phone_num(String emp_phone_num) {
        this.emp_phone_num = emp_phone_num;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
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

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_ssn='" + emp_ssn + '\'' +
                ", emp_firstname='" + emp_firstname + '\'' +
                ", emp_lastname='" + emp_lastname + '\'' +
                ", emp_type='" + emp_type + '\'' +
                ", emp_bd='" + emp_bd + '\'' +
                ", years=" + years +
                ", emp_hotel_id=" + emp_hotel_id +
                ", emp_salary=" + emp_salary +
                ", emp_phone_num='" + emp_phone_num + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", emp_gender='" + emp_gender + '\'' +
                ", street='" + street + '\'' +
                ", no='" + no + '\'' +
                ", apartment='" + apartment + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}
