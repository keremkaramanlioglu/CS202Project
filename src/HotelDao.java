import entities.*;

import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;

public class HotelDao {
    Connection con;
    PreparedStatement stmt;

    public HotelDao(Connection con) throws SQLException {
        this.con = con;
    }

    public boolean compare(String s1, String[] strings) {
        for (String str : strings) {
            if (s1.equals(str)) return true;
        }
        return false;
    }

    public void insertHotel(Hotel hotel) throws SQLException {
        String sql = "INSERT INTO Hotels (hotel_name, hotel_phone, " +
                "hotel_email, hotel_rating, street, no, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, hotel.getHotel_name());
        stmt.setString(2, hotel.getHotel_phone());
        stmt.setString(3, hotel.getHotel_email());
        stmt.setDouble(4, hotel.getHotel_rating());
        stmt.setString(5, hotel.getStreet());
        stmt.setString(6, hotel.getNo());
        stmt.setString(7, hotel.getZip_code());
        stmt.executeUpdate();
    }
    public void updateHotel(Hotel hotel) throws SQLException {
        String sql = "UPDATE Hotels SET hotel_name = ?, hotel_phone = ?, hotel_email = ?, hotel_rating = ?, street = ?, no = ?, zip_code = ? WHERE hotel_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, hotel.getHotel_name());
        stmt.setString(2, hotel.getHotel_phone());
        stmt.setString(3, hotel.getHotel_email());
        stmt.setDouble(4, hotel.getHotel_rating());
        stmt.setString(5, hotel.getStreet());
        stmt.setString(6, hotel.getNo());
        stmt.setString(7, hotel.getZip_code());
        stmt.setInt(8, hotel.getHotel_id());
        stmt.executeUpdate();
    }
    public void deleteHotel(Hotel hotel) {}
    public void insertRoom(Room room) throws SQLException {
        String sql = "INSERT INTO Rooms (hotel_id, room_num, room_type, room_size, room_price, room_capacity) VALUES(?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, room.getHotel_id());
        stmt.setString(2, room.getRoom_num());
        stmt.setString(3, room.getRoom_type());
        stmt.setDouble(4, room.getRoom_size());
        stmt.setDouble(5, room.getRoom_price());
        stmt.setString(6, room.getRoom_capacity());
        stmt.executeUpdate();
    }
    public void updateRoom(Room room) throws SQLException {
        String sql = "UPDATE Rooms SET hotel_id = ?, room_num = ?, room_type = ?, room_size = ?, room_price = ?, room_capacity = ? WHERE room_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, room.getHotel_id());
        stmt.setString(2, room.getRoom_num());
        stmt.setString(3, room.getRoom_type());
        stmt.setInt(4, room.getRoom_size());
        stmt.setDouble(5, room.getRoom_price());
        stmt.setString(6, room.getRoom_capacity());
        stmt.executeUpdate();
    }
    public void deleteRoom(Room room) throws SQLException {
        String sql = "DELETE FROM Rooms WHERE room_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, room.getRoom_id());
        stmt.executeUpdate();
    }
    public void insertCustomer(Customer customer) throws SQLException {
        String sql = "INSERT INTO Customers (c_ssn, c_firstname, c_lastname, c_bd, c_room_id, c_email, c_phone_num, c_gender, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, customer.getC_ssn());
        stmt.setString(2, customer.getC_firstname());
        stmt.setString(3, customer.getC_lastname());
        stmt.setDate(4, customer.getC_bd());
        stmt.setDouble(5, customer.getC_room_id());
        stmt.setString(6, customer.getC_email());
        stmt.setString(7, customer.getC_phone_num());
        stmt.setString(8, customer.getC_gender());
        stmt.setString(9, customer.getZip_code());
        stmt.executeUpdate();
    }
    public void updateCustomer(Customer customer) throws SQLException {
        String sql = "UPDATE Customers SET c_firstname = ?, c_lastname = ?, c_bd = ?, c_room_id = ?, c_email = ?, c_phone_num = ?, c_gender = ?, zip_code = ? WHERE c_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, customer.getC_ssn());
        stmt.setString(2, customer.getC_firstname());
        stmt.setString(3, customer.getC_lastname());
        stmt.setDate(4, customer.getC_bd());
        stmt.setDouble(5, customer.getC_room_id());
        stmt.setString(6, customer.getC_email());
        stmt.setString(7, customer.getC_phone_num());
        stmt.setString(8, customer.getC_gender());
        stmt.setString(9, customer.getZip_code());
        stmt.executeUpdate();
    }
    public void deleteCustomer(Customer customer) throws SQLException {
        String sql = "DELETE FROM Customers WHERE c_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, customer.getC_ssn());
        stmt.executeUpdate();
    }
    public void insertEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO Employees (emp_ssn, emp_firstname, emp_lastname, emp_type, emp_bd, years, emp_hotel_id, emp_salary, emp_phone_num, emp_email, emp_gender, street, no, apartment, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, employee.getEmp_ssn());
        stmt.setString(2, employee.getEmp_firstname());
        stmt.setString(3, employee.getEmp_lastname());
        stmt.setString(4, employee.getEmp_type());
        stmt.setString(5, employee.getEmp_bd());
        stmt.setDate(6, employee.getYears());
        stmt.setInt(7, employee.getEmp_hotel_id());
        stmt.setDouble(8, employee.getEmp_salary());
        stmt.setString(9, employee.getEmp_phone_num());
        stmt.setString(10, employee.getEmp_email());
        stmt.setString(11, employee.getEmp_gender());
        stmt.setString(12, employee.getStreet());
        stmt.setString(13, employee.getNo());
        stmt.setString(14, employee.getApartment());
        stmt.setString(15, employee.getZip_code());
        stmt.executeUpdate();
    }
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE Employees SET emp_firstname = ?, emp_lastname = ?, emp_type = ?, emp_bd = ?, years = ?, emp_hotel_id = ?, emp_salary = ?, emp_phone_num = ?, emp_email = ?, emp_gender = ?, street = ?, no = ?, apartment = ?, zip_code = ? WHERE emp_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, employee.getEmp_ssn());
        stmt.setString(2, employee.getEmp_firstname());
        stmt.setString(3, employee.getEmp_lastname());
        stmt.setString(4, employee.getEmp_type());
        stmt.setString(5, employee.getEmp_bd());
        stmt.setDate(6, employee.getYears());
        stmt.setInt(7, employee.getEmp_hotel_id());
        stmt.setDouble(8, employee.getEmp_salary());
        stmt.setString(9, employee.getEmp_phone_num());
        stmt.setString(10, employee.getEmp_email());
        stmt.setString(11, employee.getEmp_gender());
        stmt.setString(12, employee.getStreet());
        stmt.setString(13, employee.getNo());
        stmt.setString(14, employee.getApartment());
        stmt.setString(15, employee.getZip_code());
        stmt.executeUpdate();
    }
    public void deleteEmployee(Employee employee) throws SQLException {
        String sql = "DELETE FROM Employees WHERE emp_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, employee.getEmp_ssn());
        stmt.executeUpdate();
    }
    public void insertBooking(Booking booking) throws SQLException {
        String sql = "INSERT INTO Bookings (c_ssn, room_id, payment_status, payment_method, booking_start_date, booking_end_date, c_check_in_status, c_check_out_status) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, booking.getC_ssn());
        stmt.setInt(2, booking.getRoom_id());
        stmt.setString(3, booking.getPayment_status());
        stmt.setString(4, booking.getPayment_method());
        stmt.setTimestamp(5, booking.getBooking_start_date());
        stmt.setTimestamp(6, booking.getBooking_end_date());
        stmt.setBoolean(7, booking.isC_check_in_status());
        stmt.setBoolean(8, booking.isC_check_out_status());
        stmt.executeUpdate();
    }
    public void updateBooking(Booking booking) throws SQLException {
        String sql = "UPDATE Bookings SET c_ssn = ?, room_id = ?, payment_status = ?, payment_method = ?, booking_start_date = ?, booking_end_date = ?, c_check_in_status = ?, c_check_out_status = ? WHERE booking_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, booking.getC_ssn());
        stmt.setInt(2, booking.getRoom_id());
        stmt.setString(3, booking.getPayment_status());
        stmt.setString(4, booking.getPayment_method());
        stmt.setTimestamp(5, booking.getBooking_start_date());
        stmt.setTimestamp(6, booking.getBooking_end_date());
        stmt.setBoolean(7, booking.isC_check_in_status());
        stmt.setBoolean(8, booking.isC_check_out_status());
        stmt.executeUpdate();
    }
    public void deleteBooking(Booking booking) throws SQLException {
        String sql = "DELETE FROM Bookings WHERE booking_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, booking.getBooking_id());
        stmt.executeUpdate();
    }
    public void insertParkingLot(ParkingLot parkingLot) throws SQLException {
        String sql = "INSERT INTO ParkingLot (park_id, hotel_id, capacity) VALUES(?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, parkingLot.getPark_id());
        stmt.setInt(2, parkingLot.getHotel_id());
        stmt.setInt(3, parkingLot.getCapacity());
        stmt.executeUpdate();
    }
    public void deleteHotel(Hotel hotel) throws SQLException {
        String sql = "DELETE FROM Hotels WHERE hotel_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, hotel.getHotel_id());
        stmt.executeUpdate();
    }
    public void updateParkingLot(ParkingLot parkingLot) throws SQLException {
        String sql = "UPDATE ParkingLot SET hotel_id = ?, capacity = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, parkingLot.getHotel_id());
        stmt.setInt(2, parkingLot.getCapacity());
        stmt.executeUpdate();
    }
    public void deleteParkingLot(ParkingLot parkingLot) throws SQLException {
        String sql = "DELETE FROM ParkingLot WHERE park_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, parkingLot.getPark_id());
        stmt.executeUpdate();
    }
    public void insertCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "INSERT INTO CleaningSchedule (housekeeper_ssn, receptionist_ssn, " +
                "room_id, cleaning_date, service_status) VALUES(?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, cleaningSchedule.getHousekeeper_ssn());
        stmt.setString(2, cleaningSchedule.getReceptionist_ssn());
        stmt.setInt(3, cleaningSchedule.getRoom_id());
        stmt.setTimestamp(4, cleaningSchedule.getCleaning_date());
        stmt.setString(5, cleaningSchedule.getService_status());
        stmt.executeUpdate();
    }
    public void updateCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "UPDATE CleaningSchedule SET housekeeper_ssn = ?, receptionist_ssn = ?, room_id = ?, cleaning_date = ?, service_status = ? WHERE schedule_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, cleaningSchedule.getHousekeeper_ssn());
        stmt.setString(2, cleaningSchedule.getReceptionist_ssn());
        stmt.setInt(3, cleaningSchedule.getRoom_id());
        stmt.setTimestamp(4, cleaningSchedule.getCleaning_date());
        stmt.setString(5, cleaningSchedule.getService_status());
        stmt.setInt(6, cleaningSchedule.getSchedule_id());
        stmt.executeUpdate();
    }
    public void deleteCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "DELETE FROM CleaningSchedule WHERE schedule_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, cleaningSchedule.getSchedule_id());
        stmt.executeUpdate();
    }

    public ArrayList<Room> getRooms(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "";
        ArrayList<Room> rooms = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Rooms";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM Rooms WHERE " + filterColumn + filterOption + " ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            rooms.add(new Room(rs));
        }
        return rooms;
    }

    public ArrayList<Room> getRooms(String filterColumn, String filterOption, String filterValue, String filterValueUpper) throws SQLException {
        String sql = "";
        ArrayList<Room> rooms = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Rooms";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM Rooms WHERE " + filterColumn + filterOption + " ? AND ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);
        stmt.setString(2, filterValueUpper);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            rooms.add(new Room(rs));
        }
        return rooms;
    }

    public ArrayList<Customer> getCustomers(String filterColumn, String filterOption, String filterValue) throws SQLException {

        String sql = "";
        ArrayList<Customer> customers = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Customers";
        } else {
            String cus = "c_";
            if (!compare(filterColumn, new String[]{"zip_code"})) {
                filterColumn = cus + filterColumn;
            }

            String column = "";
            String where = "";
            sql = "SELECT * FROM Customers WHERE " + filterColumn + filterOption + " ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            customers.add(new Customer(rs));
        }
        return customers;

    }
    public ArrayList<Employee> getEmployees(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "";
        ArrayList<Employee> employees = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Employees";
        } else {
            String emp = "emp_";
            if (!compare(filterColumn, new String[]{"years", "street", "no", "apartment", "zip_code"})) {
                filterColumn = emp + filterColumn;
            }

            String column = "";
            String where = "";
            sql = "SELECT * FROM Employees WHERE " + filterColumn + filterOption + " ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            employees.add(new Employee(rs));
        }
        return employees;
    }

    public ArrayList<Booking> getBookings(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "";
        ArrayList<Booking> bookings = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Bookings";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM Bookings WHERE " + filterColumn + filterOption + " ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            bookings.add(new Booking(rs));
        }
        return bookings;
    }

    public ArrayList<Booking> getBookings(String filterColumn, String filterOption, String filterValue, String filterValueUpper) throws SQLException {
        String sql = "";
        ArrayList<Booking> bookings = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Bookings";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM Bookings WHERE " + filterColumn + filterOption + " ? AND ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);
        stmt.setString(2, filterValueUpper);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            bookings.add(new Booking(rs));
        }
        return bookings;
    }

    public ArrayList<ParkingLot> getParkingLots(String filterColumn, String filterOption, String filterValue) throws SQLException {
        return null;
    }

    public ArrayList<CleaningSchedule> getCleaningSchedules(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "";
        ArrayList<CleaningSchedule> cs = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM CleaningSchedule";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM CleaningSchedule WHERE " + filterColumn + filterOption + " ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            cs.add(new CleaningSchedule(rs));
        }
        return cs;
    }

    public ArrayList<CleaningSchedule> getCleaningSchedules(String filterColumn, String filterOption, String filterValue, String filterValueUpper) throws SQLException {
        String sql = "";
        ArrayList<CleaningSchedule> cs = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM CleaningSchedule";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM CleaningSchedule WHERE " + filterColumn + filterOption + "  ? AND ?";
        }

        stmt = con.prepareStatement(sql);
        stmt.setString(1, filterValue);
        stmt.setString(2, filterValueUpper);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            cs.add(new CleaningSchedule(rs));
        }
        return cs;
    }

    public void executeQuery(String query) {

    }
}
