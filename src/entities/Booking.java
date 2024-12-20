package entities;

import javax.swing.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    private Object booking_id;
    private Object c_ssn;
    private Object room_id;
    private Object payment_status;
    private Object payment_method;
    private Object booking_start_date;
    private Object booking_end_date;
    private Object c_check_in_status;
    private Object c_check_out_status;

    public Booking(ResultSet rs) throws SQLException { // TODO : ADD TRY BLOCK
        this.booking_id = rs.getObject("booking_id");
        this.c_ssn = rs.getObject("c_ssn");
        this.room_id = rs.getObject("room_id");
        this.payment_status = rs.getObject("payment_status");
        this.payment_method = rs.getObject("payment_method");
        this.booking_start_date = rs.getObject("booking_start_date");
        this.booking_end_date = rs.getObject("booking_end_date");
        this.c_check_in_status = rs.getObject("c_check_in_status");
        this.c_check_out_status = rs.getObject("c_check_out_status");
    }

    public Booking(Object[] objs) {
        if (objs.length == 9) {
            this.booking_id = objs[0];
            this.c_ssn = objs[1];
            this.room_id = objs[2];
            this.payment_status = objs[3];
            this.payment_method = objs[4];
            this.booking_start_date = objs[5];
            this.booking_end_date = objs[6];
            this.c_check_in_status = objs[7];
            this.c_check_out_status = objs[8];
        } else {
            this.booking_id = null;
            this.c_ssn = objs[0];
            this.room_id = objs[1];
            this.payment_status = objs[2];
            this.payment_method = objs[3];
            this.booking_start_date = objs[4];
            this.booking_end_date = objs[5];
            this.c_check_in_status = objs[6];
            this.c_check_out_status = objs[7];
        }
    }

    private Timestamp toTimestamp(String dateString) {
        // Define the date format of the input string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Timestamp timestamp = null;

        try {
            // Parse the input string to a java.util.Date object
            java.util.Date parsedDate = dateFormat.parse(dateString);

            // Convert java.util.Date to java.sql.Timestamp
            timestamp = new Timestamp(parsedDate.getTime());

            // Print the result
            //System.out.println("Input String: " + dateString +" And It data type is"+ dateString.getClass());
            //System.out.println("Converted Timestamp: "+ timestamp +" And It data type is "+ timestamp.getClass());

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return timestamp;
    }

    public Object getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Object booking_id) {
        this.booking_id = booking_id;
    }

    public Object getC_ssn() {
        return c_ssn;
    }

    public void setC_ssn(Object c_ssn) {
        this.c_ssn = c_ssn;
    }

    public Object getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Object room_id) {
        this.room_id = room_id;
    }

    public Object getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(Object payment_status) {
        this.payment_status = payment_status;
    }

    public Object getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(Object payment_method) {
        this.payment_method = payment_method;
    }

    public Object getBooking_start_date() {
        return booking_start_date;
    }

    public void setBooking_start_date(Object booking_start_date) {
        this.booking_start_date = booking_start_date;
    }

    public Object getBooking_end_date() {
        return booking_end_date;
    }

    public void setBooking_end_date(Object booking_end_date) {
        this.booking_end_date = booking_end_date;
    }

    public Object isC_check_in_status() {
        return c_check_in_status;
    }

    public void setC_check_in_status(Object c_check_in_status) {
        this.c_check_in_status = c_check_in_status;
    }

    public Object isC_check_out_status() {
        return c_check_out_status;
    }

    public void setC_check_out_status(Object c_check_out_status) {
        this.c_check_out_status = c_check_out_status;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "booking_id=" + booking_id +
                ", c_ssn='" + c_ssn + '\'' +
                ", room_id=" + room_id +
                ", payment_status='" + payment_status + '\'' +
                ", payment_method='" + payment_method + '\'' +
                ", booking_start_date=" + booking_start_date +
                ", booking_end_date=" + booking_end_date +
                ", c_check_in_status=" + c_check_in_status +
                ", c_check_out_status=" + c_check_out_status +
                '}';
    }
}
