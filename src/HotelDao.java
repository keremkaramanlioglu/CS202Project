import entities.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

import static java.sql.JDBCType.NULL;

public class HotelDao {
    Connection con;
    private static final Logger logger = Logger.getLogger(HotelDao.class.getName());

    public HotelDao(Connection con) throws SQLException {
        this.con = con;
        this.con.setAutoCommit(false);  // Auto-commit devre dışı
        configureLogger();
    }

    private void configureLogger() {
        try {
            FileHandler fileHandler = new FileHandler("hotel_dao.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.severe("Logger configuration failed: " + e.getMessage());
        }
    }

    private void ensureAutoCommitFalse() throws SQLException {
        if (con.getAutoCommit()) {
            con.setAutoCommit(false);
        }
    }

    private void rollbackTransaction() {
        try {
            if (con != null) {
                con.rollback();
                logger.warning("Transaction rolled back.");
            }
        } catch (SQLException e) {
            logger.severe("Rollback failed: " + e.getMessage());
        }
    }

    public boolean compare(String s1, String[] strings) {
        for (String str : strings) {
            if (s1.equals(str)) return true;
        }
        return false;
    }

    //insert, update, delete

    public int insertRoom(Room room) {
        String sql = "INSERT INTO Rooms (hotel_id, room_num, room_type, room_size, room_price, room_capacity) VALUES(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, room.getHotel_id());
            stmt.setObject(2, room.getRoom_num());
            stmt.setObject(3, room.getRoom_type());
            stmt.setObject(4, room.getRoom_size());
            stmt.setObject(5, room.getRoom_price());
            stmt.setObject(6, room.getRoom_capacity());

            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Room inserted successfully: Room number " + room.getRoom_num());
            return result;
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to insert room: " + e.getMessage());
            return 0;
        }
    }

    public int updateRoom(Room room) {
        String sql = "UPDATE Rooms SET hotel_id = ?, room_num = ?, room_type = ?, room_size = ?, room_price = ?, room_capacity = ? WHERE room_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, room.getHotel_id());
            stmt.setObject(2, room.getRoom_num());
            stmt.setObject(3, room.getRoom_type());
            stmt.setObject(4, room.getRoom_size());
            stmt.setObject(5, room.getRoom_price());
            stmt.setObject(6, room.getRoom_capacity());
            stmt.setObject(7, room.getRoom_id());

            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Room updated successfully: Room ID " + room.getRoom_id());
            return result;
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to update room: " + e.getMessage());
            return 0;
        }
    }

    public int deleteRoom(Room room) {
        String sql = "DELETE FROM Rooms WHERE room_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, room.getRoom_id());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Room deleted successfully: Room ID " + room.getRoom_id());
            return result;
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to delete room: " + e.getMessage());
            return 0;
        }
    }

    public int insertCustomer(Customer customer) throws SQLException {
        String sql = "INSERT INTO Customers (c_ssn, c_firstname, c_lastname, c_bd, c_room_id, c_email, c_phone_num, c_gender, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
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

            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Customer inserted successfully: Customer ID " + customer.getC_ssn());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to insert customer: " + e.getMessage());
            return 0;
        }
    }

    public int updateCustomer(Customer customer) throws SQLException {
        String sql = "UPDATE Customers SET c_firstname = ?, c_lastname = ?, c_bd = ?, c_room_id = ?, c_email = ?, c_phone_num = ?, c_gender = ?, zip_code = ? WHERE c_ssn = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(9, customer.getC_ssn());
            stmt.setObject(1, customer.getC_firstname());
            stmt.setObject(2, customer.getC_lastname());
            stmt.setObject(3, customer.getC_bd());
            if (customer.getC_room_id() != NULL) stmt.setObject(4, customer.getC_room_id());
            else stmt.setNull(4, java.sql.Types.NULL);
            stmt.setObject(5, customer.getC_email());
            stmt.setObject(6, customer.getC_phone_num());
            stmt.setObject(7, customer.getC_gender());
            stmt.setObject(8, customer.getZip_code());

            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Customer updated successfully: Customer SSN " + customer.getC_ssn());
            return result;
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to update customer: " + e.getMessage());
            return 0;
        }
    }

    public int deleteCustomer(Customer customer) throws SQLException {
        String sql = "DELETE FROM Customers WHERE c_ssn = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, customer.getC_ssn());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Customer deleted successfully: Customer ID " + customer.getC_ssn());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to delete customer: " + e.getMessage());
            return 0;
        }
    }

    public int insertEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO Employees (emp_ssn, emp_firstname, emp_lastname, emp_type, emp_bd, years, emp_hotel_id, emp_salary, emp_phone_num, emp_email, emp_gender, street, no, apartment, zip_code) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
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
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Employee inserted successfully: Employee ID " + employee.getEmp_ssn());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to insert employee: " + e.getMessage());
            return 0;
        }
    }

    public int updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE Employees SET emp_firstname = ?, emp_lastname = ?, emp_type = ?, emp_bd = ?, years = ?, emp_hotel_id = ?, emp_salary = ?, emp_phone_num = ?, emp_email = ?, emp_gender = ?, street = ?, no = ?, apartment = ?, zip_code = ? WHERE emp_ssn = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(15, employee.getEmp_ssn());
            stmt.setObject(1, employee.getEmp_firstname());
            stmt.setObject(2, employee.getEmp_lastname());
            stmt.setObject(3, employee.getEmp_type());
            stmt.setObject(4, employee.getEmp_bd());
            stmt.setObject(5, employee.getYears());
            stmt.setObject(6, employee.getEmp_hotel_id());
            stmt.setObject(7, employee.getEmp_salary());
            stmt.setObject(8, employee.getEmp_phone_num());
            stmt.setObject(9, employee.getEmp_email());
            stmt.setObject(10, employee.getEmp_gender());
            stmt.setObject(11, employee.getStreet());
            stmt.setObject(12, employee.getNo());
            if (employee.getApartment().equals("null")) stmt.setObject(13, null);
            else stmt.setObject(13, employee.getApartment());
            stmt.setObject(14, employee.getZip_code());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Employee updated successfully: Employee SSN " + employee.getEmp_ssn());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to update employee: " + e.getMessage());
            return 0;
        }
    }

    public int deleteEmployee(Employee employee) throws SQLException {
        String sql = "DELETE FROM Employees WHERE emp_ssn = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, employee.getEmp_ssn());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Employee deleted successfully: Employee ID " + employee.getEmp_ssn());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to delete employee: " + e.getMessage());
            return 0;
        }
    }

    public int insertBooking(Booking booking) throws SQLException {
        String sql = "INSERT INTO Bookings (c_ssn, room_id, payment_status, payment_method, booking_start_date, booking_end_date, c_check_in_status, c_check_out_status) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, booking.getC_ssn());
            stmt.setObject(2, booking.getRoom_id());
            stmt.setObject(3, booking.getPayment_status());
            stmt.setObject(4, booking.getPayment_method());
            stmt.setObject(5, booking.getBooking_start_date());
            stmt.setObject(6, booking.getBooking_end_date());
            stmt.setObject(7, booking.isC_check_in_status());
            stmt.setObject(8, booking.isC_check_out_status());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Booking inserted successfully: Booking ID " + booking.getBooking_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to insert booking: " + e.getMessage());
            return 0;
        }
    }

    public int updateBooking(Booking booking) throws SQLException {
        String sql = "UPDATE Bookings SET c_ssn = ?, room_id = ?, payment_status = ?, payment_method = ?, booking_start_date = ?, booking_end_date = ?, c_check_in_status = ?, c_check_out_status = ? WHERE booking_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, booking.getC_ssn());
            stmt.setObject(2, booking.getRoom_id());
            stmt.setObject(3, booking.getPayment_status());
            stmt.setObject(4, booking.getPayment_method());
            stmt.setObject(5, booking.getBooking_start_date());
            stmt.setObject(6, booking.getBooking_end_date());
            stmt.setObject(7, booking.isC_check_in_status());
            stmt.setObject(8, booking.isC_check_out_status());
            stmt.setObject(9, booking.getBooking_id());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Booking updated successfully: Booking ID " + booking.getBooking_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to update booking: " + e.getMessage());
            return 0;
        }
    }

    public int deleteBooking(Booking booking) throws SQLException {
        String sql = "DELETE FROM Bookings WHERE booking_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, booking.getBooking_id());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Booking deleted successfully: Booking ID " + booking.getBooking_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to delete booking: " + e.getMessage());
            return 0;
        }
    }

    public int insertCleaningScheduleWithRoomNum(CleaningSchedule cleaningSchedule, Object roomNum, Object hotelId) throws SQLException {
        int roomId = getRoomID(roomNum, hotelId);
        String insertScheduleQuery = "INSERT INTO CleaningSchedule (housekeeper_ssn, receptionist_ssn, room_id, cleaning_date, service_status) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement insertStmt = con.prepareStatement(insertScheduleQuery)) {
            ensureAutoCommitFalse();
            insertStmt.setObject(1, cleaningSchedule.getHousekeeper_ssn());
            insertStmt.setObject(2, cleaningSchedule.getReceptionist_ssn());
            insertStmt.setObject(3, roomId);
            insertStmt.setObject(4, cleaningSchedule.getCleaning_date());
            insertStmt.setObject(5, cleaningSchedule.getService_status());
            int result = insertStmt.executeUpdate();
            con.commit();
            logger.info("Cleaning schedule inserted successfully: Schedule ID " + cleaningSchedule.getSchedule_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to insert cleaning schedule: " + e.getMessage());
            return 0;
        }
    }

    public int updateCleaningScheduleWithRoomNum(CleaningSchedule cleaningSchedule, Object roomNum, Object hotelId) throws SQLException {
        int roomId = getRoomID(roomNum, hotelId);
        String updateScheduleQuery = "UPDATE CleaningSchedule " +
                "SET housekeeper_ssn = ?, receptionist_ssn = ?, room_id = ?, cleaning_date = ?, service_status = ? " +
                "WHERE schedule_id = ?";
        try (PreparedStatement updateStmt = con.prepareStatement(updateScheduleQuery)) {
            ensureAutoCommitFalse();
            updateStmt.setObject(1, cleaningSchedule.getHousekeeper_ssn());
            updateStmt.setObject(2, cleaningSchedule.getReceptionist_ssn());
            updateStmt.setObject(3, roomId);
            updateStmt.setObject(4, cleaningSchedule.getCleaning_date());
            updateStmt.setObject(5, cleaningSchedule.getService_status());
            updateStmt.setObject(6, cleaningSchedule.getSchedule_id());
            int result = updateStmt.executeUpdate();
            con.commit();
            logger.info("Cleaning schedule updated successfully: Schedule ID" + cleaningSchedule.getSchedule_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to update cleaning schedule: " + e.getMessage());
            return 0;
        }
    }

    public int insertCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "INSERT INTO CleaningSchedule (housekeeper_ssn, receptionist_ssn, " +
                "room_id, cleaning_date, service_status) VALUES(?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, cleaningSchedule.getHousekeeper_ssn());
            stmt.setObject(2, cleaningSchedule.getReceptionist_ssn());
            stmt.setObject(3, cleaningSchedule.getRoom_id());
            stmt.setObject(4, cleaningSchedule.getCleaning_date());
            stmt.setObject(5, cleaningSchedule.getService_status());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Cleaning schedule inserted successfully: Schedule ID " + cleaningSchedule.getSchedule_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to insert cleaning schedule: " + e.getMessage());
            return 0;
        }
    }

    public int updateCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "UPDATE CleaningSchedule SET housekeeper_ssn = ?, receptionist_ssn = ?, room_id = ?, cleaning_date = ?, service_status = ? WHERE schedule_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, cleaningSchedule.getHousekeeper_ssn());
            stmt.setObject(2, cleaningSchedule.getReceptionist_ssn());
            stmt.setObject(3, cleaningSchedule.getRoom_id());
            stmt.setObject(4, cleaningSchedule.getCleaning_date());
            stmt.setObject(5, cleaningSchedule.getService_status());
            stmt.setObject(6, cleaningSchedule.getSchedule_id());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Cleaning schedule updated successfully: Schedule ID" + cleaningSchedule.getSchedule_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to update cleaning schedule: " + e.getMessage());
            return 0;
        }
    }

    public int deleteCleaningSchedule(CleaningSchedule cleaningSchedule) throws SQLException {
        String sql = "DELETE FROM CleaningSchedule WHERE schedule_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, cleaningSchedule.getSchedule_id());
            int result = stmt.executeUpdate();
            con.commit();
            logger.info("Cleaning schedule deleted successfully: Schedule ID" + cleaningSchedule.getSchedule_id());
            return result;
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to delete cleaning schedule: " + e.getMessage());
            return 0;
        }
    }

    //Getters

    public int getRoomID(Object roomNum, Object hotelId) throws SQLException {
        int roomId = -1;
        String findRoomIdQuery = "SELECT room_id FROM Rooms WHERE room_num = ? AND hotel_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(findRoomIdQuery)) {
            stmt.setObject(1, roomNum);
            stmt.setObject(2, hotelId);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    roomId = rs.getInt("room_id");
                } else {
                    throw new SQLException("Room not found for the given room number and hotel ID.");
                }
            }
        } catch (SQLException e) {
            logger.severe("Failed to get room ID: " + e.getMessage());
            throw e;
        }
        return roomId;
    }

    public ArrayList<Customer> getCustomers(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql;
        ArrayList<Customer> customers = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Customers";
        } else {
            String cus = "c_";
            if (!compare(filterColumn, new String[]{"zip_code"})) {
                filterColumn = cus + filterColumn;
            }
            sql = "SELECT * FROM Customers WHERE " + filterColumn + filterOption + " ?";
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            if (!filterOption.equals("None")) {
                stmt.setObject(1, filterValue);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    customers.add(new Customer(rs));
                }
            }

            if (customers.isEmpty()) {
                logger.warning("No Customer found.");
            } else {
                logger.info(customers.size() + " customers found.");
            }
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to get customers: " + e.getMessage());
            throw e;
        }
        return customers;
    }

    public ArrayList<Employee> getEmployees(String filterColumn, String filterOption, String filterValue) throws SQLException {
        String sql = "SELECT * FROM Employees";
        ArrayList<Employee> employees = new ArrayList<>();

        if (filterOption.equals("None")) {
            sql = "SELECT * FROM Employees";
        } else {
            String emp = "emp_";
            if (!compare(filterColumn, new String[]{"years", "street", "no", "apartment", "zip_code"})) {
                filterColumn = emp + filterColumn;
            }
            if (!filterColumn.equals("emp_salary") && !filterColumn.equals("emp_hotel_id")){
                filterValue = "'" + filterValue + "'";
            }

            sql = "SELECT * FROM Employees WHERE " + filterColumn + filterOption + filterValue;
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    employees.add(new Employee(rs));
                }
            }
            if (employees.isEmpty()) {
                logger.warning("No Employee found.");
            } else {
                logger.info(employees.size() + " employees found.");
            }
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to get employees: " + e.getMessage());
            throw e;
        }
        return bookings;
    }
        }
        return employees;
    }

    // NEW

    public ArrayList<Object[]> filterBookings(String columnName, String filterOption, String filterValue, String filterValueUpper, Object hotelID) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        switch (filterOption) {
            case "None":
                sql = "SELECT * FROM Bookings b, Rooms r WHERE b.room_id = r.room_id AND r.hotel_id = ?";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT * FROM Bookings b, Rooms r WHERE b.room_id = r.room_id AND r.hotel_id = ? AND " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT * FROM Bookings b, Rooms r WHERE b.room_id = r.room_id AND r.hotel_id = ? AND " + columnName + " BETWEEN ? AND ?";
                break;
            case "contains":
                sql = "SELECT * FROM Bookings b, Rooms r WHERE b.room_id = r.room_id AND r.hotel_id = ? AND " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setObject(1, hotelID);
                    stmt.setObject(2, filterValue);
                    stmt.setObject(3, filterValueUpper);
                } else {
                    stmt.setObject(1, hotelID);
                    stmt.setObject(2, filterValue);
                }
            }else {
                stmt.setObject(1, hotelID);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(
                            new Object[]{
                                    rs.getObject("booking_id"),
                                    rs.getObject("c_ssn"),
                                    rs.getObject("room_id"),
                                    rs.getObject("payment_status"),
                                    rs.getObject("payment_method"),
                                    rs.getObject("booking_start_date"),
                                    rs.getObject("booking_end_date"),
                                    rs.getObject("c_check_in_status"),
                                    rs.getObject("c_check_out_status")
                            }
                    );
                }
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to get bookings from filter: " + e.getMessage());
            throw e;
        }

        return result;
    }

    public ArrayList<Object[]> filterEmployees(String columnName, String filterOption, String filterValue, String filterValueUpper, Object emp_hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";
        String emp = "emp_";

        if (!compare(columnName, new String[]{"years", "street", "no", "apartment", "zip_code"})) {
            columnName = emp + columnName;
        }

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
                filterValue = "%" + filterValue + "%";
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }


        if (emp_hotel_id != null) {
            if (filterOption.equals("None")) {
                sql += " WHERE emp_hotel_id = ?";
            } else {
                sql += " AND emp_hotel_id = ?";
            }
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            if (!filterOption.equals("None")) {
                stmt.setObject(1, filterValue);
                if (filterOption.equals("between")) {
                    stmt.setObject(1, filterValue);
                    stmt.setObject(2, filterValueUpper);
                    stmt.setObject(3, emp_hotel_id);
                } else {
                    stmt.setObject(1, filterValue);
                    stmt.setObject(2, emp_hotel_id);
                }
            } else{
                stmt.setObject(1, emp_hotel_id);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Object[] row = new Object[15];
                    row[0] = rs.getObject("emp_ssn");
                    row[1] = rs.getObject("emp_firstname");
                    row[2] = rs.getObject("emp_lastname");
                    row[3] = rs.getObject("emp_type");
                    row[4] = rs.getObject("emp_bd");
                    row[5] = rs.getObject("years");
                    row[6] = rs.getObject("emp_hotel_id");
                    row[7] = rs.getObject("emp_salary");
                    row[8] = rs.getObject("emp_phone_num");
                    row[9] = rs.getObject("emp_email");
                    row[10] = rs.getObject("emp_gender");
                    row[11] = rs.getObject("street");
                    row[12] = rs.getObject("no");
                    row[13] = rs.getObject("apartment");
                    row[14] = rs.getObject("zip_code");
                    result.add(row);
                }
            }
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to filter employees: " + e.getMessage());
            throw e;
        }
        return result;
    }
    public double calculateRevenue(Object start, Object end, Object hotelID) {
        double totalRevenue = 0.0;
        String query = "SELECT SUM(r.room_price * DATEDIFF(b.booking_end_date, b.booking_start_date)) AS total_revenue "
                + "FROM Bookings b "
                + "JOIN Rooms r ON b.room_id = r.room_id "
                + "WHERE r.hotel_id = ? "
                + "AND b.booking_start_date >= ? "
                + "AND b.booking_end_date <= ? "
                + "AND b.payment_status = 'Completed' ";

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, hotelID);  // hotelID
            stmt.setObject(2, start);  // start date
            stmt.setObject(3, end);  // end date
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    totalRevenue = rs.getDouble("total_revenue");
                }
            }
        } catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to calculate revenue: " + e.getMessage());
            throw e;
        }
        return totalRevenue;
    }

    public ArrayList<Object[]> filterCleaningSchedule(String columnName, String filterOption, String filterValue, String filterValueUpper, int emp_hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

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
            ensureAutoCommitFalse();
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setString(2, filterValue);
                    stmt.setString(3, filterValueUpper);
                    stmt.setObject(1, emp_hotel_id);
                } else {
                    stmt.setString(2, filterValue);
                    stmt.setObject(1, emp_hotel_id);
                }
            } else{
                stmt.setObject(1, emp_hotel_id);
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
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to filter cleaning schedules: " + e.getMessage());
            throw e;
        }

        return result;
    }

    public ArrayList<Object[]> filterRooms(String columnName, String filterOption, String filterValue, String filterValueUpper, Object hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

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
            ensureAutoCommitFalse();
            if (!filterOption.equals("None")) {
                if (filterOption.equals("between")) {
                    stmt.setObject(1, hotel_id);
                    stmt.setObject(2, filterValue);
                    stmt.setObject(3, filterValueUpper);
                } else {
                    stmt.setObject(1, hotel_id);
                    stmt.setObject(2, filterValue);
                }
            } else {
                stmt.setObject(1, hotel_id);
            }

            try (ResultSet rs = stmt.executeQuery()) {
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
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to filter rooms: " + e.getMessage());
            throw e;
        }

        return result;
    }

    public ArrayList<Object[]> viewMyBookings(String ssn) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();

        String sql = """
                SELECT h.hotel_name, h.hotel_phone, h.hotel_email,h.zip_code, r.room_num,r.room_type, b.booking_start_date, b.booking_end_date
                FROM Bookings b
                JOIN Rooms r ON b.room_id = r.room_id
                JOIN Hotels h ON r.hotel_id = h.hotel_id
                WHERE b.c_ssn = ?;""";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setString(1, ssn);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Object[] row = new Object[rs.getMetaData().getColumnCount()];
                    row[0] = rs.getObject("hotel_name");
                    row[1] = rs.getObject("hotel_phone");
                    row[2] = rs.getObject("hotel_email");
                    row[3] = rs.getObject("zip_code");
                    row[4] = rs.getObject("room_num");
                    row[5] = rs.getObject("room_type");
                    row[6] = rs.getObject("booking_start_date");
                    row[7] = rs.getObject("booking_end_date");
                    result.add(row);
                }
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to view bookings: " + e.getMessage());
            throw e;
        }
        return result;
    }

    public int getHotelID(Object hotelPhone) throws SQLException {
        String sql = "SELECT hotel_id FROM Hotels WHERE hotel_phone = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            stmt.setObject(1, hotelPhone);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("hotel_id");
                }
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to get hotel ID: " + e.getMessage());
            throw e;
        }
        throw new SQLException("No Hotel found");
    }

    public ArrayList<Object[]> viewAvailableRooms(Object startDate, Object endDate) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();

        String sql = "SELECT h.hotel_name, h.hotel_phone, h.hotel_email, h.hotel_rating, h.street, h.no, h.zip_code, r.room_num, r.room_type, r.room_size, r.room_price, r.room_capacity " +
                "FROM Rooms r JOIN Hotels h ON r.hotel_id = h.hotel_id " +
                "WHERE NOT EXISTS (SELECT 1 " +
                                    "FROM Bookings b " +
                                    "WHERE b.room_id = r.room_id AND ((b.booking_start_date BETWEEN ? AND ?) OR " +
                                                                    "(b.booking_end_date BETWEEN ? AND ?) OR " +
                                                                    "(b.booking_start_date <= ? AND b.booking_end_date >= ?)));";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setObject(1, startDate);
            stmt.setObject(2, endDate);
            stmt.setObject(3, startDate);
            stmt.setObject(4, endDate);
            stmt.setObject(5, startDate);
            stmt.setObject(6, endDate);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Object[] row = new Object[rs.getMetaData().getColumnCount()];
                    row[0] = rs.getObject("hotel_name");
                    row[1] = rs.getObject("hotel_phone");
                    row[2] = rs.getObject("hotel_email");
                    row[3] = rs.getObject("hotel_rating");
                    row[4] = rs.getObject("street");
                    row[5] = rs.getObject("no");
                    row[6] = rs.getObject("zip_code");
                    row[7] = rs.getObject("room_num");
                    row[8] = rs.getObject("room_type");
                    row[9] = rs.getObject("room_size");
                    row[10] = rs.getObject("room_price");
                    row[11] = rs.getObject("room_capacity");
                    result.add(row);
                }
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to view available rooms: " + e.getMessage());
            throw e;
        }
        return result;
    }

    public ArrayList<Object[]> viewAvailableRooms(Date startDate, Object endDate, Object hotelID) throws SQLException {
        ArrayList<Object[]> availableRooms = new ArrayList<>();

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
            ensureAutoCommitFalse();
            stmt.setObject(1, hotelID);
            stmt.setObject(2, startDate);
            stmt.setObject(3, endDate);
            stmt.setObject(4, startDate);
            stmt.setObject(5, endDate);
            stmt.setObject(6, startDate);
            stmt.setObject(7, endDate);
            stmt.setObject(8, startDate);
            stmt.setObject(9, endDate);

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Object[] row = new Object[6];
                    row[0] = rs.getObject("room_num");
                    row[1] = rs.getObject("room_size");
                    row[2] = rs.getObject("room_capacity");
                    row[3] = rs.getObject("room_price");
                    row[4] = rs.getObject("room_type");


                    String cleaningStatus = rs.getString("service_status");
                    if (cleaningStatus == null) {
                        cleaningStatus = "No Cleaning Schedule";
                    }
                    row[5] = cleaningStatus;

                    availableRooms.add(row);
                }
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to view available rooms: " + e.getMessage());
            throw e;
        }
        return availableRooms;
    }

    public ArrayList<Object[]> filterCustomers(String columnName, String filterOption, String filterValue, String filterValueUpper, int hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

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
                WHERE (r.hotel_id = ? OR c.c_room_id IS NULL) AND\s""" + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = """
                SELECT c.c_ssn, c.c_firstname, c.c_lastname, c.c_bd, c.c_room_id, c.c_email, c.c_phone_num, c.c_gender, c.zip_code
                FROM Customers c
                LEFT JOIN Rooms r ON c.c_room_id = r.room_id
                WHERE (r.hotel_id = ? OR c.c_room_id IS NULL) AND\s""" + columnName + " BETWEEN ? AND ?";
                break;
            case "contains":
                sql = """
                SELECT c.c_ssn, c.c_firstname, c.c_lastname, c.c_bd, c.c_room_id, c.c_email, c.c_phone_num, c.c_gender, c.zip_code
                FROM Customers c
                LEFT JOIN Rooms r ON c.c_room_id = r.room_id
                WHERE (r.hotel_id = ? OR c.c_room_id IS NULL) AND\s""" + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%"; // Adjust filterValue for LIKE
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
            if (!filterOption.equals("None")) {
                stmt.setInt(1, hotel_id);
                if (filterOption.equals("between")) {
                    stmt.setString(2, filterValue);
                    stmt.setString(3, filterValueUpper);
                } else {
                    stmt.setString(2, filterValue);
                }
            } else {
                stmt.setInt(1, hotel_id);
            }

            try (ResultSet rs = stmt.executeQuery()) {
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
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to filter customers: " + e.getMessage());
        }
        return result;
    }

    public ArrayList<Object[]> filterCleaningScheduleRcp(String columnName, String filterOption, String filterValue, String filterValueUpper, int emp_hotel_id) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        String sql = "";

        switch (filterOption) {
            case "None":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ?";
                break;
            case "=":
            case "!=":
            case "<":
            case ">":
            case "<=":
            case ">=":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? AND " + columnName + " " + filterOption + " ?";
                break;
            case "between":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? (" + columnName + " BETWEEN ? AND ?)";
                break;
            case "contains":
                sql = "SELECT cs.schedule_id, cs.housekeeper_ssn, r.room_num, cs.cleaning_date, cs.service_status FROM CleaningSchedule cs JOIN Rooms r ON cs.room_id = r.room_id WHERE r.hotel_id = ? " + columnName + " LIKE ?";
                filterValue = "%" + filterValue + "%";
                break;
            default:
                throw new IllegalArgumentException("Invalid filter option: " + filterOption);
        }

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ensureAutoCommitFalse();
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
                    Object[] row = new Object[5];
                    row[0] = rs.getObject("schedule_id");
                    row[1] = rs.getObject("housekeeper_ssn");
                    row[2] = rs.getObject("room_num");
                    row[3] = rs.getObject("cleaning_date");
                    row[4] = rs.getObject("service_status");
                    result.add(row);
                }
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to filter cleaning schedules: " + e.getMessage());
            throw e;
        }

        return result;
    }

    public ResultSet getResultSet(String query) throws SQLException {
        ResultSet resultSet = null;
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            ensureAutoCommitFalse();
            resultSet = stmt.executeQuery(query);
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to get result set: " + e.getMessage());
            throw e;
        }

        return resultSet;
    }


    public ArrayList<Object[]> initializeTable(String panelName, String name, Object hotel_id, String ssn) throws SQLException {
        ArrayList<Object[]> result = new ArrayList<>();
        int hotelID = Integer.parseInt(hotel_id.toString());
        switch (name){
            case "ManagerPanel":
                if (panelName.equals("Rooms")) {
                    result = filterRooms("room_id", "None", "", "", hotelID);
                } else if (panelName.equals("Bookings")) {
                    result = filterBookings("booking_id", "None", "", "", hotelID);
                } else if (panelName.equals("Employees")) {
                    result = filterEmployees("employee_id", "None", "", "", hotelID);
                } else if (panelName.equals("Housekeeping")) {
                    result = filterCleaningSchedule("housekeeping_id", "None", "", "", hotelID);
                } else if (panelName.equals("Users")) {
                    result = filterCustomers("user_id", "None", "", "", hotelID);
                }
                break;
            case "ReceptionistPanel":
                if (panelName.equals("Bookings")) {
                    result = filterBookings("booking_id", "None", "", "", hotelID);
                } else if (panelName.equals("Housekeeping")) {
                    result = filterCleaningScheduleRcp("housekeeping_id", "None", "", "", hotelID);
                }
                break;
            case "CustomerPanel":
                System.out.println("suck my dick 2");
                if (panelName.equals("My Bookings")) {
                    System.out.println("suck my dick");
                    result = viewMyBookings(ssn);
                } else if (panelName.equals("Book a room")) {

                }
                break;
            case "HousekeeperPanel":
                if (panelName.equals("My Jobs")) {
                    System.out.println("entered");
                }
        }
        System.out.println("exiting from the method");
        return result;
    }

    public ArrayList<Object[]> getCustomerBookingData(String customerSSN) {
        ArrayList<Object[]> dataList = new ArrayList<>();

        String query = """
            SELECT\s
                h.hotel_name,\s
                h.hotel_phone,\s
                h.hotel_email,\s
                h.zip_code,\s
                r.room_num,\s
                r.room_type,\s
                b.booking_start_date,\s
                b.booking_end_date
            FROM Customers c
            JOIN Bookings b ON c.c_ssn = b.c_ssn
            JOIN Rooms r ON b.room_id = r.room_id
            JOIN Hotels h ON r.hotel_id = h.hotel_id
            WHERE c.c_ssn = ?;
       \s""";

        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, customerSSN);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] row = new Object[8];
                    row[0] = resultSet.getObject("hotel_name");
                    row[1] = resultSet.getObject("hotel_phone");
                    row[2] = resultSet.getObject("hotel_email");
                    row[3] = resultSet.getObject("zip_code");
                    row[4] = resultSet.getObject("room_num");
                    row[5] = resultSet.getObject("room_type");
                    row[6] = resultSet.getObject("booking_start_date");
                    row[7] = resultSet.getObject("booking_end_date");
                    dataList.add(row);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return dataList;
    }

    public boolean isCustomerExist(Object currCustomerSsn) throws SQLException {
        String sql = "SELECT 1 FROM Customers WHERE c_ssn = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, String.valueOf(currCustomerSsn));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return true;
            }
        }catch (SQLException e) {
            rollbackTransaction();
            logger.severe("Failed to identify is custome rexist: " + e.getMessage());
            throw e;
        }
        return false;
    }
}