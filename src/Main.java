import entities.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        HotelView view = new HotelView();

        new HotelManager(hotel, view);
    }
}