package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
    private Object emp_ssn;
    private Object emp_firstname;
    private Object emp_lastname;
    private Object emp_type;
    private Object emp_bd;
    private Object years;
    private Object emp_hotel_id;
    private Object emp_salary;
    private Object emp_phone_num;
    private Object emp_email;
    private Object emp_gender;
    private Object street;
    private Object no;
    private Object apartment;
    private Object zip_code;

    public Employee(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.emp_ssn = rs.getObject("emp_ssn");
        this.emp_firstname = rs.getObject("emp_firstname");
        this.emp_lastname = rs.getObject("emp_lastname");
        this.emp_type = rs.getObject("emp_type");
        this.emp_bd = rs.getObject("emp_bd");
        this.years = rs.getObject("years");
        this.emp_hotel_id = rs.getObject("emp_hotel_id");
        this.emp_salary = rs.getObject("emp_salary");
        this.emp_phone_num = rs.getObject("emp_phone_num");
        this.emp_email = rs.getObject("emp_email");
        this.emp_gender = rs.getObject("emp_gender");
        this.street = rs.getObject("street");
        this.no = rs.getObject("no");
        this.apartment = rs.getObject("apartment");
        this.zip_code = rs.getObject("zip_code");
    }

    public Employee(Object[] obj) {
        this.emp_ssn = obj[0];
        this.emp_firstname = obj[1];
        this.emp_lastname = obj[2];
        this.emp_type = obj[3];
        this.emp_bd = obj[4];
        this.years = obj[5];
        this.emp_hotel_id = obj[6];
        this.emp_salary = obj[7];
    }

    public Employee() {

    }

    public boolean equals(Employee employee) {
        return this.emp_ssn.equals(employee.emp_ssn);
    }

    public Object getEmp_ssn() {
        return emp_ssn;
    }

    public void setEmp_ssn(Object emp_ssn) {
        this.emp_ssn = emp_ssn;
    }

    public Object getEmp_firstname() {
        return emp_firstname;
    }

    public void setEmp_firstname(Object emp_firstname) {
        this.emp_firstname = emp_firstname;
    }

    public Object getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(Object emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public Object getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(Object emp_type) {
        this.emp_type = emp_type;
    }

    public Object getEmp_bd() {
        return emp_bd;
    }

    public void setEmp_bd(Object emp_bd) {
        this.emp_bd = emp_bd;
    }

    public Object getYears() {
        return years;
    }

    public void setYears(Object years) {
        this.years = years;
    }

    public Object getEmp_hotel_id() {
        return emp_hotel_id;
    }

    public void setEmp_hotel_id(Object emp_hotel_id) {
        this.emp_hotel_id = emp_hotel_id;
    }

    public Object getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Object emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Object getEmp_phone_num() {
        return emp_phone_num;
    }

    public void setEmp_phone_num(Object emp_phone_num) {
        this.emp_phone_num = emp_phone_num;
    }

    public Object getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(Object emp_email) {
        this.emp_email = emp_email;
    }

    public Object getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(Object emp_gender) {
        this.emp_gender = emp_gender;
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

    public Object getApartment() {
        return apartment;
    }

    public void setApartment(Object apartment) {
        this.apartment = apartment;
    }

    public Object getZip_code() {
        return zip_code;
    }

    public void setZip_code(Object zip_code) {
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
