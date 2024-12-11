package entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CleaningSchedule {
    private int schedule_id;
    private String housekeeper_ssn;
    private String receptionist_ssn;
    private int room_id;
    private Timestamp cleaning_date;
    private String service_status;

    public CleaningSchedule(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.schedule_id = rs.getInt("schedule_id");
        this.housekeeper_ssn = rs.getString("housekeeper_ssn");
        this.receptionist_ssn = rs.getString("receptionist_ssn");
        this.room_id = rs.getInt("room_id");
        this.cleaning_date = rs.getTimestamp("cleaning_date");
        this.service_status = rs.getString("service_status");
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getHousekeeper_ssn() {
        return housekeeper_ssn;
    }

    public void setHousekeeper_ssn(String housekeeper_ssn) {
        this.housekeeper_ssn = housekeeper_ssn;
    }

    public String getReceptionist_ssn() {
        return receptionist_ssn;
    }

    public void setReceptionist_ssn(String receptionist_ssn) {
        this.receptionist_ssn = receptionist_ssn;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public Timestamp getCleaning_date() {
        return cleaning_date;
    }

    public void setCleaning_date(Timestamp cleaning_date) {
        this.cleaning_date = cleaning_date;
    }

    public String getService_status() {
        return service_status;
    }

    public void setService_status(String service_status) {
        this.service_status = service_status;
    }

    @Override
    public String toString() {
        return "CleaningSchedule{" +
                "schedule_id=" + schedule_id +
                ", housekeeper_ssn='" + housekeeper_ssn + '\'' +
                ", receptionist_ssn='" + receptionist_ssn + '\'' +
                ", room_id=" + room_id +
                ", cleaning_date=" + cleaning_date +
                ", service_status='" + service_status + '\'' +
                '}';
    }
}
