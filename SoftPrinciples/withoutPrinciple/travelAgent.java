
class TravelBooking {
    public void bookFlight() {
        System.out.println("Booking flight directly with the airline.");
    }

    public void bookHotel() {
        System.out.println("Booking hotel directly with the hotel.");
    }

    public void bookCarRental() {
        System.out.println("Booking car rental directly with the car rental company.");
    }
}

public class travelAgent {
    public static void main(String[] args) {
        TravelBooking booking = new TravelBooking();

        // You manually book each service yourself
        booking.bookFlight();
        booking.bookHotel();
        booking.bookCarRental();
    }
}
