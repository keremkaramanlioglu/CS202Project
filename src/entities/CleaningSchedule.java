package entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CleaningSchedule {
    private Object schedule_id;
    private Object housekeeper_ssn;
    private Object receptionist_ssn;
    private Object room_id;
    private Object cleaning_date;
    private Object service_status;

    public CleaningSchedule(ResultSet rs) throws SQLException {  // TODO : ADD TRY BLOCK
        this.schedule_id = rs.getObject("schedule_id");
        this.housekeeper_ssn = rs.getObject("housekeeper_ssn");
        this.receptionist_ssn = rs.getObject("receptionist_ssn");
        this.room_id = rs.getObject("room_id");
        this.cleaning_date = rs.getObject("cleaning_date");
        this.service_status = rs.getObject("service_status");
    }

    public CleaningSchedule(Object[] obj) {
        if (obj.length == 6) {
            this.schedule_id = obj[0];
            this.housekeeper_ssn = obj[1];
            this.receptionist_ssn = obj[2];
            this.room_id = obj[3];
            this.cleaning_date = obj[4];
            this.service_status = obj[5];
        } else {
            this.schedule_id = null;
            this.housekeeper_ssn = obj[0];
            this.receptionist_ssn = obj[1];
            this.room_id = obj[2];
            this.cleaning_date = obj[3];
            this.service_status = obj[4];
        }
    }

    public Object getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Object schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Object getHousekeeper_ssn() {
        return housekeeper_ssn;
    }

    public void setHousekeeper_ssn(Object housekeeper_ssn) {
        this.housekeeper_ssn = housekeeper_ssn;
    }

    public Object getReceptionist_ssn() {
        return receptionist_ssn;
    }

    public void setReceptionist_ssn(Object receptionist_ssn) {
        this.receptionist_ssn = receptionist_ssn;
    }

    public Object getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Object room_id) {
        this.room_id = room_id;
    }

    public Object getCleaning_date() {
        return cleaning_date;
    }

    public void setCleaning_date(Object cleaning_date) {
        this.cleaning_date = cleaning_date;
    }

    public Object getService_status() {
        return service_status;
    }

    public void setService_status(Object service_status) {
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
