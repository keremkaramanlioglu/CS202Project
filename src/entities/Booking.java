package entities;

import javax.swing.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    private int booking_id;
    private String c_ssn;
    private int room_id;
    private String payment_status;
    private String payment_method;
    private Timestamp booking_start_date;
    private Timestamp booking_end_date;
    private boolean c_check_in_status;
    private boolean c_check_out_status;

    public Booking(ResultSet rs) throws SQLException { // TODO : ADD TRY BLOCK
        this.booking_id = rs.getInt("booking_id");
        this.c_ssn = rs.getString("c_ssn");
        this.room_id = rs.getInt("room_id");
        this.payment_status = rs.getString("payment_status");
        this.payment_method = rs.getString("payment_method");
        this.booking_start_date = rs.getTimestamp("booking_start_date");
        this.booking_end_date = rs.getTimestamp("booking_end_date");
        this.c_check_in_status = rs.getBoolean("c_check_in_status");
        this.c_check_out_status = rs.getBoolean("c_check_out_status");
    }

    public Booking(Object[] objs) {
        if (objs.length == 9) {
            this.booking_id = (Integer) objs[0];
            this.c_ssn = (String) objs[1];
            this.room_id = (Integer) objs[2];
            this.payment_status = (String) objs[3];
            this.payment_method = (String) objs[4];
            this.booking_start_date = (Timestamp) objs[5];
            this.booking_end_date = (Timestamp) objs[6];
            this.c_check_in_status = (Boolean) objs[7];
            this.c_check_out_status = (Boolean) objs[8];
        } else {
            this.c_ssn = (String) objs[0];
            this.room_id = (Integer) objs[1];
            this.payment_status = (String) objs[2];
            this.payment_method = (String) objs[3];
            this.booking_start_date = toTimestamp((String)objs[4]);
            this.booking_end_date = toTimestamp((String) objs[5]);
            this.c_check_in_status = (Boolean) objs[6];
            this.c_check_out_status = (Boolean) objs[7];
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

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getC_ssn() {
        return c_ssn;
    }

    public void setC_ssn(String c_ssn) {
        this.c_ssn = c_ssn;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Timestamp getBooking_start_date() {
        return booking_start_date;
    }

    public void setBooking_start_date(Timestamp booking_start_date) {
        this.booking_start_date = booking_start_date;
    }

    public Timestamp getBooking_end_date() {
        return booking_end_date;
    }

    public void setBooking_end_date(Timestamp booking_end_date) {
        this.booking_end_date = booking_end_date;
    }

    public boolean isC_check_in_status() {
        return c_check_in_status;
    }

    public void setC_check_in_status(boolean c_check_in_status) {
        this.c_check_in_status = c_check_in_status;
    }

    public boolean isC_check_out_status() {
        return c_check_out_status;
    }

    public void setC_check_out_status(boolean c_check_out_status) {
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
