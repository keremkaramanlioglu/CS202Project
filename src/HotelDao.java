import entities.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HotelDao {
    Connection con;

    public HotelDao(Connection con) throws SQLException {
        this.con = con;
    }

    public void insertHotel(Hotel hotel) throws SQLException {
        String sql = "INSERT INTO Hotels (hotel_name, hotel_phone, " +
                "hotel_email, hotel_rating, street, no, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, hotel.getHotel_name());
        stmt.setString(2, hotel.getHotel_phone());
        stmt.setString(3, hotel.getHotel_email());
        stmt.setDouble(4, hotel.getHotel_rating());
        stmt.setString(5, hotel.getStreet());
        stmt.setString(6, hotel.getNo());
        stmt.setString(7, hotel.getZip_code());
        stmt.executeUpdate();
    }
    public void updateHotel(Hotel hotel) {}
    public void deleteHotel(Hotel hotel) {}
    public void insertRoom(Room room) {}
    public void updateRoom(Room room) {}
    public void deleteRoom(Room room) {}
    public void insertCustomer(Customer customer) {}
    public void updateCustomer(Customer customer) {}
    public void deleteCustomer(Customer customer) {}
    public void insertEmployee(Employee employee) {}
    public void updateEmployee(Employee employee) {}
    public void deleteEmployee(Employee employee) {}
    public void insertBooking(Booking booking) {}
    public void updateBooking(Booking booking) {}
    public void deleteBooking(Booking booking) {}
    public void insertParkingLot(ParkingLot parkingLot) {}
    public void updateParkingLot(ParkingLot parkingLot) {}
    public void deleteParkingLot(ParkingLot parkingLot) {}
    public void insertCleaningSchedule(CleaningSchedule cleaningSchedule) {}
    public void updateCleaningSchedule(CleaningSchedule cleaningSchedule) {}
    public void deleteCleaningSchedule(CleaningSchedule cleaningSchedule) {}

    public ArrayList<Room> getRooms(String filterColumn, String filterOption, String filterValue) {
        return null;
    }
    public ArrayList<Customer> getCustomers(String filterColumn, String filterValue) {
        return null;
    }
    public ArrayList<Employee> getEmployees(String filterColumn, String filterValue) {
        return null;
    }
    public ArrayList<Booking> getBookings(String filterColumn, String filterValue) {
        return null;
    }
    public ArrayList<ParkingLot> getParkingLots(String filterColumn, String filterValue) {
        return null;
    }
    public ArrayList<CleaningSchedule> getCleaningSchedules(String filterColumn, String filterValue) {
        return null;
    }
    public void executeQuery(String query) {}
}
