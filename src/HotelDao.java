import entities.*;

import javax.lang.model.type.NullType;
import java.sql.*;
import java.util.ArrayList;

import static java.sql.JDBCType.NULL;

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

    public int insertHotel(Hotel hotel) throws SQLException {
        String sql = "INSERT INTO Hotels (hotel_name, hotel_phone, " +
                "hotel_email, hotel_rating, street, no, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, hotel.getHotel_name());
        stmt.setObject(2, hotel.getHotel_phone());
        stmt.setObject(3, hotel.getHotel_email());
        stmt.setObject(4, hotel.getHotel_rating());
        stmt.setObject(5, hotel.getStreet());
        stmt.setObject(6, hotel.getNo());
        stmt.setObject(7, hotel.getZip_code());
        return stmt.executeUpdate();
    }
    public int updateHotel(Hotel hotel) throws SQLException {
        String sql = "UPDATE Hotels SET hotel_name = ?, hotel_phone = ?, hotel_email = ?, hotel_rating = ?, street = ?, no = ?, zip_code = ? WHERE hotel_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, hotel.getHotel_name());
        stmt.setObject(2, hotel.getHotel_phone());
        stmt.setObject(3, hotel.getHotel_email());
        stmt.setObject(4, hotel.getHotel_rating());
        stmt.setObject(5, hotel.getStreet());
        stmt.setObject(6, hotel.getNo());
        stmt.setObject(7, hotel.getZip_code());
        stmt.setObject(8, hotel.getHotel_id());

        return stmt.executeUpdate();
    }
    public int insertRoom(Room room) throws SQLException {
        String sql = "INSERT INTO Rooms (hotel_id, room_num, room_type, room_size, room_price, room_capacity) VALUES(?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, room.getHotel_id());
        stmt.setObject(2, room.getRoom_num());
        stmt.setObject(3, room.getRoom_type());
        stmt.setObject(4, room.getRoom_size());
        stmt.setObject(5, room.getRoom_price());
        stmt.setObject(6, room.getRoom_capacity());


        return stmt.executeUpdate();
    }
    public int updateRoom(Room room) throws SQLException {
        String sql = "UPDATE Rooms SET hotel_id = ?, room_num = ?, room_type = ?, room_size = ?, room_price = ?, room_capacity = ? WHERE room_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, room.getHotel_id());
        stmt.setObject(2, room.getRoom_num());
        stmt.setObject(3, room.getRoom_type());
        stmt.setObject(4, room.getRoom_size());
        stmt.setObject(5, room.getRoom_price());
        stmt.setObject(6, room.getRoom_capacity());
        stmt.setObject(7, room.getRoom_id());

        return stmt.executeUpdate();
    }
    public int deleteRoom(Room room) throws SQLException {
        String sql = "DELETE FROM Rooms WHERE room_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, room.getRoom_id());
        return stmt.executeUpdate();
    }
    public int insertCustomer(Customer customer) throws SQLException {
        System.out.println(customer.getC_room_id());
        if (customer.getC_room_id() == null){
            System.out.println("it is null");
        }
        String sql = "INSERT INTO Customers (c_ssn, c_firstname, c_lastname, c_bd, c_room_id, c_email, c_phone_num, c_gender, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, customer.getC_ssn());
        stmt.setObject(2, customer.getC_firstname());
        stmt.setObject(3, customer.getC_lastname());
        stmt.setObject(4, customer.getC_bd());
        if (customer.getC_room_id() != NULL) stmt.setObject(5, customer.getC_room_id());
        else stmt.setNull(5, java.sql.Types.NULL);
        stmt.setObject(6, customer.getC_email());
        stmt.setObject(7, customer.getC_phone_num());
        stmt.setObject(8, customer.getC_gender());
        stmt.setObject(9, customer.getZip_code());


        return stmt.executeUpdate();
    }
    public int updateCustomer(Customer customer) throws SQLException {
        String sql = "UPDATE Customers SET c_firstname = ?, c_lastname = ?, c_bd = ?, c_room_id = ?, c_email = ?, c_phone_num = ?, c_gender = ?, zip_code = ? WHERE c_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(9, customer.getC_ssn());
        stmt.setObject(1, customer.getC_firstname());
        stmt.setObject(2, customer.getC_lastname());
        stmt.setObject(3, customer.getC_bd());
        stmt.setObject(4, customer.getC_room_id());
        stmt.setObject(5, customer.getC_email());
        stmt.setObject(6, customer.getC_phone_num());
        stmt.setObject(7, customer.getC_gender());
        stmt.setObject(8, customer.getZip_code());

        return stmt.executeUpdate();
    }
    public int deleteCustomer(Customer customer) throws SQLException {
        String sql = "DELETE FROM Customers WHERE c_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, customer.getC_ssn());
        return stmt.executeUpdate();
    }
    public int insertEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO Employees (emp_ssn, emp_firstname, emp_lastname, emp_type, emp_bd, years, emp_hotel_id, emp_salary, emp_phone_num, emp_email, emp_gender, street, no, apartment, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, employee.getEmp_ssn());
        stmt.setObject(2, employee.getEmp_firstname());
        stmt.setObject(3, employee.getEmp_lastname());
        stmt.setObject(4, employee.getEmp_type());
        stmt.setObject(5, employee.getEmp_bd());
        stmt.setObject(6, employee.getYears());
        stmt.setObject(7, employee.getEmp_hotel_id());
        stmt.setObject(8, employee.getEmp_salary());
        stmt.setObject(9, employee.getEmp_phone_num());
        stmt.setObject(10, employee.getEmp_email());
        stmt.setObject(11, employee.getEmp_gender());
        stmt.setObject(12, employee.getStreet());
        stmt.setObject(13, employee.getNo());
        stmt.setObject(14, employee.getApartment());
        stmt.setObject(15, employee.getZip_code());

        return stmt.executeUpdate();
    }
    public int updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE Employees SET emp_firstname = ?, emp_lastname = ?, emp_type = ?, emp_bd = ?, years = ?, emp_hotel_id = ?, emp_salary = ?, emp_phone_num = ?, emp_email = ?, emp_gender = ?, street = ?, no = ?, apartment = ?, zip_code = ? WHERE emp_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, employee.getEmp_ssn());
        stmt.setObject(2, employee.getEmp_firstname());
        stmt.setObject(3, employee.getEmp_lastname());
        stmt.setObject(4, employee.getEmp_type());
        stmt.setObject(5, employee.getEmp_bd());
        stmt.setObject(6, employee.getYears());
        stmt.setObject(7, employee.getEmp_hotel_id());
        stmt.setObject(8, employee.getEmp_salary());
        stmt.setObject(9, employee.getEmp_phone_num());
        stmt.setObject(10, employee.getEmp_email());
        stmt.setObject(11, employee.getEmp_gender());
        stmt.setObject(12, employee.getStreet());
        stmt.setObject(13, employee.getNo());
        stmt.setObject(14, employee.getApartment());
        stmt.setObject(15, employee.getZip_code());

        return stmt.executeUpdate();
    }
    public int deleteEmployee(Employee employee) throws SQLException {
        String sql = "DELETE FROM Employees WHERE emp_ssn = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, employee.getEmp_ssn());
        return stmt.executeUpdate();
    }
    public int insertBooking(Booking booking) throws SQLException {
        String sql = "INSERT INTO Bookings (c_ssn, room_id, payment_status, payment_method, booking_start_date, booking_end_date, c_check_in_status, c_check_out_status) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, booking.getC_ssn());
        stmt.setObject(2, booking.getRoom_id());
        stmt.setObject(3, booking.getPayment_status());
        stmt.setObject(4, booking.getPayment_method());
        stmt.setObject(5, booking.getBooking_start_date());
        stmt.setObject(6, booking.getBooking_end_date());
        stmt.setObject(7, booking.isC_check_in_status());
        stmt.setObject(8, booking.isC_check_out_status());

        return stmt.executeUpdate();
    }
    public int updateBooking(Booking booking) throws SQLException {
        String sql = "UPDATE Bookings SET c_ssn = ?, room_id = ?, payment_status = ?, payment_method = ?, booking_start_date = ?, booking_end_date = ?, c_check_in_status = ?, c_check_out_status = ? WHERE booking_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, booking.getC_ssn());
        stmt.setObject(2, booking.getRoom_id());
        stmt.setObject(3, booking.getPayment_status());
        stmt.setObject(4, booking.getPayment_method());
        stmt.setObject(5, booking.getBooking_start_date());
        stmt.setObject(6, booking.getBooking_end_date());
        stmt.setObject(7, booking.isC_check_in_status());
        stmt.setObject(8, booking.isC_check_out_status());
        stmt.setObject(9, booking.getBooking_id());

        return stmt.executeUpdate();
    }
    public int deleteBooking(Booking booking) throws SQLException {
        String sql = "DELETE FROM Bookings WHERE booking_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, booking.getBooking_id());
        return stmt.executeUpdate();
    }
    public int insertParkingLot(ParkingLot parkingLot) throws SQLException {
        String sql = "INSERT INTO ParkingLot (park_id, hotel_id, capacity) VALUES(?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, parkingLot.getPark_id());
        stmt.setObject(2, parkingLot.getHotel_id());
        stmt.setObject(3, parkingLot.getCapacity());
        return stmt.executeUpdate();
    }
    public int deleteHotel(Hotel hotel) throws SQLException {
        String sql = "DELETE FROM Hotels WHERE hotel_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, hotel.getHotel_id());
        return stmt.executeUpdate();
    }
    public int updateParkingLot(ParkingLot parkingLot) throws SQLException {
        String sql = "UPDATE ParkingLot SET hotel_id = ?, capacity = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, parkingLot.getHotel_id());
        stmt.setObject(2, parkingLot.getCapacity());
        return stmt.executeUpdate();
    }
    public int deleteParkingLot(ParkingLot parkingLot) throws SQLException {
        String sql = "DELETE FROM ParkingLot WHERE park_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, parkingLot.getPark_id());
        return stmt.executeUpdate();
    }
    public int insertCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "INSERT INTO CleaningSchedule (housekeeper_ssn, receptionist_ssn, " +
                "room_id, cleaning_date, service_status) VALUES(?, ?, ?, ?, ?)";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, cleaningSchedule.getHousekeeper_ssn());
        stmt.setObject(2, cleaningSchedule.getReceptionist_ssn());
        stmt.setObject(3, cleaningSchedule.getRoom_id());
        stmt.setObject(4, cleaningSchedule.getCleaning_date());
        stmt.setObject(5, cleaningSchedule.getService_status());
        return stmt.executeUpdate();
    }
    public int updateCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "UPDATE CleaningSchedule SET housekeeper_ssn = ?, receptionist_ssn = ?, room_id = ?, cleaning_date = ?, service_status = ? WHERE schedule_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, cleaningSchedule.getHousekeeper_ssn());
        stmt.setObject(2, cleaningSchedule.getReceptionist_ssn());
        stmt.setObject(3, cleaningSchedule.getRoom_id());
        stmt.setObject(4, cleaningSchedule.getCleaning_date());
        stmt.setObject(5, cleaningSchedule.getService_status());
        stmt.setObject(6, cleaningSchedule.getSchedule_id());
        return stmt.executeUpdate();
    }
    public int deleteCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "DELETE FROM CleaningSchedule WHERE schedule_id = ?";
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, cleaningSchedule.getSchedule_id());
        return stmt.executeUpdate();
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

    }                                                   //Salary
    public ArrayList<Employee> getEmployees(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "SELECT * FROM Employees";
        ArrayList<Employee> employees = new ArrayList<>();
        //System.out.println(filterColumn +" "+ filterOption +" "+ filterValue);

        //System.out.println(filterOption.equals("None"));

        if (filterOption.equals("None")) {
            //System.out.println("Entered");
            sql = "SELECT * FROM Employees";
        } else {
            String emp = "emp_";
            if (!compare(filterColumn, new String[]{"years", "street", "no", "apartment", "zip_code"})) {
                filterColumn = emp + filterColumn;
            }
            if (!filterColumn.equals("emp_salary") && !filterColumn.equals("emp_hotel_id")){
                filterValue = "'" + filterValue + "'";
            }

            String column = "";
            String where = "";
            sql = "SELECT * FROM Employees WHERE " + filterColumn + filterOption + filterValue;
            //System.out.println(sql);
        }

        stmt = con.prepareStatement(sql);

        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            employees.add(new Employee(rs));
        }
        return employees;
    }
    public ArrayList<Booking> getBookings(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "SELECT * FROM Bookings";
        ArrayList<Booking> bookings = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Bookings";
        } else {
            if (!compare(filterColumn, new String[]{"booking_id", "room_id", "c_check_in_status", "c_check_out_status"})) {
                filterValue = "'" + filterValue + "'";
            }
            String column = "";
            String where = "";
            sql = "SELECT * FROM Bookings WHERE " + filterColumn + filterOption + filterValue;
        }


        stmt = con.prepareStatement(sql);
        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            bookings.add(new Booking(rs));
        }
        return bookings;
    }
    public ArrayList<Booking> getBookings(String filterColumn, String filterOption, String filterValue, String filterValueUpper) throws SQLException {
        String sql = "SELECT * FROM Bookings";
        ArrayList<Booking> bookings = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Bookings";
        } else {
            String column = "";
            String where = "";
            sql = "SELECT * FROM Bookings WHERE " + filterColumn + filterOption + " ? AND ?";
        }

        stmt = con.prepareStatement(sql);
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
    public ArrayList<CleaningSchedule> getCleaningSchedules(int hotelID, String filterColumn, String filterOption, String filterValue) throws SQLException {
        System.out.println(hotelID);
        String sql = "SELECT DISTINCT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status " +
                "FROM CleaningSchedule cs, Rooms r, Employees e " +
                "WHERE cs.room_id = r.room_id AND e.emp_hotel_id = ? AND r.hotel_id = ?";


        ArrayList<CleaningSchedule> cleaningSchedules = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT DISTINCT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status " +
                    "FROM CleaningSchedule cs, Rooms r, Employees e " +
                    "WHERE cs.room_id = r.room_id AND e.emp_hotel_id = ? AND r.hotel_id = ?";
        } else {
            if (!compare(filterColumn, new String[]{"schedule_id", "room_id"})) {
                filterValue = "'" + filterValue + "'";
            }
            String column = "";
            String where = "";
            sql = "SELECT DISTINCT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status " +
                    "FROM CleaningSchedule cs, Rooms r, Employees e " +
                    "WHERE cs.room_id = r.room_id AND e.emp_hotel_id = ? AND r.hotel_id = ? AND cs." + filterColumn + filterOption + filterValue;
            System.out.println(sql);
        }
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, hotelID);
        stmt.setInt(2, hotelID);
        //System.out.println(stmt);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            cleaningSchedules.add(new CleaningSchedule(rs));
        }
        return cleaningSchedules;
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

    // NEW

    public ArrayList<Object[]> filterBookings(String columnName, String filterOption, String filterValue, String filterValueUpper) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        // Construct the SQL query based on filter options
        switch (filterOption) {
            case "None":
                sql = "SELECT * FROM Bookings";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT * FROM Bookings WHERE " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT * FROM Bookings WHERE " + columnName + " BETWEEN ? AND ?";
                break;
            case "contains":
                sql = "SELECT * FROM Bookings WHERE " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set query parameters based on filter options
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setString(1, filterValue);
                    stmt.setString(2, filterValueUpper);
                } else {
                    stmt.setString(1, filterValue);
                }
            }

            try (ResultSet rs = stmt.executeQuery()) {
                // Collect results into an ArrayList<Object[]>
                //rs.next();
                while (rs.next()) {
                    Object[] row = new Object[9];
                    row[0] = rs.getInt("booking_id");
                    row[1] = rs.getString("c_ssn");
                    row[2] = rs.getInt("room_id");
                    row[3] = rs.getString("payment_status");
                    row[4] = rs.getString("payment_method");
                    row[5] = rs.getDate("booking_start_date");
                    row[6] = rs.getDate("booking_end_date");
                    row[7] = rs.getBoolean("c_check_in_status");
                    row[8] = rs.getBoolean("c_check_out_status");
                    result.add(row);
                }
            }
        }

        return result;
    }

    public ArrayList<Object[]> filterEmployees(String columnName, String filterOption, String filterValue, String filterValueUpper, int emp_hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        String emp = "emp_";
        if (!compare(columnName, new String[]{"years", "street", "no", "apartment", "zip_code"})) {
            columnName = emp + columnName;
        }

        // Construct the SQL query based on filter options
        switch (filterOption) {
            case "None":
                sql = "SELECT * FROM Employees";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT * FROM Employees WHERE " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT * FROM Employees WHERE (" + columnName + " BETWEEN ? AND ?)";
                break;
            case "contains":
                sql = "SELECT * FROM Employees WHERE " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }


        if (emp_hotel_id != -1) {
            if (filterOption.equals("None")) {
                sql += " WHERE emp_hotel_id = ?";
            } else {
                sql += " AND emp_hotel_id = ?";
            }
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set query parameters based on filter options
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setString(1, filterValue);
                    stmt.setString(2, filterValueUpper);
                    stmt.setInt(3, emp_hotel_id);
                } else {
                    stmt.setString(1, filterValue);
                    stmt.setInt(2, emp_hotel_id);
                }
            } else{
                stmt.setInt(1, emp_hotel_id);
            }


            try (ResultSet rs = stmt.executeQuery()) {
                // Collect results into an ArrayList<Object[]>
                while (rs.next()) {
                    Object[] row = new Object[15];
                    row[0] = rs.getString("emp_ssn");
                    row[1] = rs.getString("emp_firstname");
                    row[2] = rs.getString("emp_lastname");
                    row[3] = rs.getString("emp_type");
                    row[4] = rs.getDate("emp_bd");
                    row[5] = rs.getDate("years");
                    row[6] = rs.getInt("emp_hotel_id");
                    row[7] = rs.getDouble("emp_salary");
                    row[8] = rs.getString("emp_phone_num");
                    row[9] = rs.getString("emp_email");
                    row[10] = rs.getString("emp_gender");
                    row[11] = rs.getString("street");
                    row[12] = rs.getString("no");
                    row[13] = rs.getString("apartment");
                    row[14] = rs.getString("zip_code");
                    result.add(row);
                }
            }
        }

        return result;
    }
    public double calculateRevenue(Date start, Date end, int hotelID) {
        double totalRevenue = 0.0;
        String query = "SELECT SUM(r.room_price * DATEDIFF(b.booking_end_date, b.booking_start_date)) AS total_revenue "
                + "FROM Bookings b "
                + "JOIN Rooms r ON b.room_id = r.room_id "
                + "WHERE r.hotel_id = ? "
                + "AND b.booking_start_date >= ? "
                + "AND b.booking_end_date <= ? "
                + "AND b.payment_status = 'Completed' ";

        try (PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setInt(1, hotelID);  // hotelID
            stmt.setDate(2, new java.sql.Date(start.getTime()));  // start date
            stmt.setDate(3, new java.sql.Date(end.getTime()));  // end date

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    totalRevenue = rs.getDouble("total_revenue");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalRevenue;
    }

    public ArrayList<Object[]> filterCleaningSchedule(String columnName, String filterOption, String filterValue, String filterValueUpper, int emp_hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";


        // Construct the SQL query based on filter options
        switch (filterOption) {
            case "None":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ?";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? AND " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? (" + columnName + " BETWEEN ? AND ?)";
                break;
            case "contains":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, cs.receptionist_ssn, cs.room_id, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }




        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set query parameters based on filter options
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setString(2, filterValue);
                    stmt.setString(3, filterValueUpper);
                    stmt.setInt(1, emp_hotel_id);
                } else {
                    stmt.setString(2, filterValue);
                    stmt.setInt(1, emp_hotel_id);
                }
            } else{
                stmt.setInt(1, emp_hotel_id);
            }


            try (ResultSet rs = stmt.executeQuery()) {
                // Collect results into an ArrayList<Object[]>
                while (rs.next()) {
                    Object[] row = new Object[6];
                    row[0] = rs.getObject("schedule_id");
                    row[1] = rs.getObject("housekeeper_ssn");
                    row[2] = rs.getObject("receptionist_ssn");
                    row[3] = rs.getObject("room_id");
                    row[4] = rs.getObject("cleaning_date");
                    row[5] = rs.getObject("service_status");
                    result.add(row);
                }
            }
        }

        return result;
    }

    public ArrayList<Object[]> filterRooms(String columnName, String filterOption, String filterValue, String filterValueUpper, int hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        // Construct the SQL query based on filter options
        switch (filterOption) {
            case "None":
                sql = "SELECT r.room_id, r.hotel_id, r.room_num, r.room_type, r.room_size, r.room_price, r.room_capacity FROM Rooms r WHERE r.hotel_id = ?";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT r.room_id, r.hotel_id, r.room_num, r.room_type, r.room_size, r.room_price, r.room_capacity FROM Rooms r WHERE r.hotel_id = ? AND " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT r.room_id, r.hotel_id, r.room_num, r.room_type, r.room_size, r.room_price, r.room_capacity FROM Rooms r WHERE r.hotel_id = ? AND (" + columnName + " BETWEEN ? AND ?)";
                break;
            case "contains":
                sql = "SELECT r.room_id, r.hotel_id, r.room_num, r.room_type, r.room_size, r.room_price, r.room_capacity FROM Rooms r WHERE r.hotel_id = ? AND " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set query parameters based on filter options
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setInt(1, hotel_id);
                    stmt.setString(2, filterValue);
                    stmt.setString(3, filterValueUpper);
                } else {
                    stmt.setInt(1, hotel_id);
                    stmt.setString(2, filterValue);
                }
            } else {
                stmt.setInt(1, hotel_id);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                // Collect results into an ArrayList<Object[]>
                while (rs.next()) {
                    Object[] row = new Object[7];
                    row[0] = rs.getObject("room_id");
                    row[1] = rs.getObject("hotel_id");
                    row[2] = rs.getObject("room_num");
                    row[3] = rs.getObject("room_type");
                    row[4] = rs.getObject("room_size");
                    row[5] = rs.getObject("room_price");
                    row[6] = rs.getObject("room_capacity");
                    result.add(row);
                }
            }
        }

        return result;
    }

    public ArrayList<Object[]> viewAvailableRooms(Date startDate, Date endDate, int hotelID) throws SQLException {
        ArrayList<Object[]> availableRooms = new ArrayList<>();

        // SQL sorgusu: Otel ID'si ve tarih aralığında rezervasyonu olmayan odaları seç
        String sql = "SELECT r.room_num, r.room_size, r.room_capacity, r.room_price, r.room_type, cs.service_status " +
                "FROM Rooms r " +
                "LEFT JOIN CleaningSchedule cs ON cs.room_id = r.room_id " +
                "WHERE r.hotel_id = ? " +
                "AND NOT EXISTS ( " +
                "   SELECT 1 FROM Bookings b " +
                "   WHERE b.room_id = r.room_id " +
                "   AND ((b.booking_start_date BETWEEN ? AND ?) " +
                "   OR (b.booking_end_date BETWEEN ? AND ?) " +
                "   OR (b.booking_start_date <= ? AND b.booking_end_date >= ?)) " +
                ") " +
                "AND NOT EXISTS ( " +
                "   SELECT 1 FROM CleaningSchedule cs2 " +
                "   WHERE cs2.room_id = r.room_id " +
                "   AND cs2.service_status = 'Pending' " +
                "   AND cs2.cleaning_date BETWEEN ? AND ? " +
                ")";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Parametreleri ayarlama
            stmt.setInt(1, hotelID);
            stmt.setDate(2, startDate);
            stmt.setDate(3, endDate);
            stmt.setDate(4, startDate);
            stmt.setDate(5, endDate);
            stmt.setDate(6, startDate);
            stmt.setDate(7, endDate);
            stmt.setDate(8, startDate);
            stmt.setDate(9, endDate);

            try (ResultSet rs = stmt.executeQuery()) {
                // Müsait odaları toplama
                while (rs.next()) {
                    Object[] row = new Object[6];
                    row[0] = rs.getString("room_num");
                    row[1] = rs.getString("room_size");
                    row[2] = rs.getString("room_capacity");
                    row[3] = rs.getDouble("room_price");
                    row[4] = rs.getString("room_type");

                    // Cleaning status NULL ise "No Cleaning Schedule" yaz
                    String cleaningStatus = rs.getString("service_status");
                    if (cleaningStatus == null) {
                        cleaningStatus = "No Cleaning Schedule";
                    }
                    row[5] = cleaningStatus;

                    availableRooms.add(row);
                }
            }
        }

        return availableRooms;
    }
    public ArrayList<Object[]> filterCustomers(String columnName, String filterOption, String filterValue, String filterValueUpper, int hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        // Construct the SQL query based on filter options
        switch (filterOption) {
            case "None":
                sql = """
                SELECT c.c_ssn, c.c_firstname, c.c_lastname, c.c_bd, c.c_room_id, c.c_email, c.c_phone_num, c.c_gender, c.zip_code
                FROM Customers c
                LEFT JOIN Rooms r ON c.c_room_id = r.room_id
                WHERE r.hotel_id = ? OR c.c_room_id IS NULL
            """;
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = """
                SELECT c.c_ssn, c.c_firstname, c.c_lastname, c.c_bd, c.c_room_id, c.c_email, c.c_phone_num, c.c_gender, c.zip_code
                FROM Customers c
                LEFT JOIN Rooms r ON c.c_room_id = r.room_id
                WHERE (r.hotel_id = ? OR c.c_room_id IS NULL) AND """ + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = """
                SELECT c.c_ssn, c.c_firstname, c.c_lastname, c.c_bd, c.c_room_id, c.c_email, c.c_phone_num, c.c_gender, c.zip_code
                FROM Customers c
                LEFT JOIN Rooms r ON c.c_room_id = r.room_id
                WHERE (r.hotel_id = ? OR c.c_room_id IS NULL) AND """ + columnName + " BETWEEN ? AND ?";
                break;
            case "contains":
                sql = """
                SELECT c.c_ssn, c.c_firstname, c.c_lastname, c.c_bd, c.c_room_id, c.c_email, c.c_phone_num, c.c_gender, c.zip_code
                FROM Customers c
                LEFT JOIN Rooms r ON c.c_room_id = r.room_id
                WHERE (r.hotel_id = ? OR c.c_room_id IS NULL) AND """ + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set query parameters based on filter options
            if (!filterOption.equals("None")) {
                stmt.setInt(1, hotel_id); // Set hotel_id parameter
                if (filterOption.equals("between")) {
                    stmt.setString(2, filterValue);
                    stmt.setString(3, filterValueUpper);
                } else {
                    stmt.setString(2, filterValue);
                }
            } else {
                stmt.setInt(1, hotel_id); // Set hotel_id parameter
            }

            try (ResultSet rs = stmt.executeQuery()) {
                // Collect results into an ArrayList<Object[]>
                while (rs.next()) {
                    Object[] row = new Object[9];
                    row[0] = rs.getString("c_ssn");
                    row[1] = rs.getString("c_firstname");
                    row[2] = rs.getString("c_lastname");
                    row[3] = rs.getDate("c_bd");
                    row[4] = rs.getInt("c_room_id");
                    row[5] = rs.getString("c_email");
                    row[6] = rs.getString("c_phone_num");
                    row[7] = rs.getString("c_gender");
                    row[8] = rs.getString("zip_code");
                    result.add(row);
                }
            }
        }

        return result;
    }


    public ArrayList<Object[]> filterCleaningScheduleRcp(String columnName, String filterOption, String filterValue, String filterValueUpper, int hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        // Construct the SQL query based on filter options
        switch (filterOption) {
            case "None":
                sql = "SELECT cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ?";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? AND " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? AND (" + columnName + " BETWEEN ? AND ?)";
                break;
            case "contains":
                sql = "SELECT cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? AND " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set query parameters based on filter options
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setInt(1, hotel_id);
                    stmt.setString(2, filterValue);
                    stmt.setString(3, filterValueUpper);
                } else {
                    stmt.setInt(1, hotel_id);
                    stmt.setString(2, filterValue);
                }
            } else {
                stmt.setInt(1, hotel_id);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                // Collect results into an ArrayList<Object[]>
                while (rs.next()) {
                    Object[] row = new Object[4];
                    row[0] = rs.getString("housekeeper_ssn");
                    row[1] = rs.getString("room_num");
                    row[2] = rs.getDate("cleaning_date");
                    row[3] = rs.getString("service_status");
                    result.add(row);
                }
            }
        }

        return result;
    }

    public boolean updateCleaningSchedule(Object[] obj, Object ssn) throws SQLException {
        String sql = "UPDATE CleaningSchedule cs " +
                "JOIN Rooms r ON cs.room_id = r.room_id " +
                "SET cs.service_status = ? " +
                "WHERE r.room_num = ? AND cs.cleaning_date = ? AND cs.housekeeper_ssn = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Set the query parameters
            stmt.setObject(1, obj[2]); // New service status
            stmt.setObject(2, obj[0]);      // Room number
            stmt.setObject(3, obj[0]); // Cleaning date
            stmt.setObject(4, ssn);
            // Execute the update
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; // Return true if at least one row was updated
        }
    }

    public ResultSet getResultSet(String query) throws SQLException {
        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet resultSet = stmt.executeQuery(query);
        return resultSet;
    }

    public ArrayList<Object[]> getRowsAsObject(ResultSet rs, ArrayList<Object> columns) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        int count = columns.size();

        while (rs.next()) {
            Object[] row = new Object[count];
            for (int i = 0; i < count; i++) {
                row[i] = rs.getObject(i + 1);
            }
            result.add(row);
        }
        return result;
    }

}
