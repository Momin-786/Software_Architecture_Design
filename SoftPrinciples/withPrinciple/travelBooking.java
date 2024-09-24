interface BookingService {
    void book();
}

class FlightBooking implements BookingService {
    @Override
    public void book() {
        System.out.println("Booking flight through the travel agent.");
    }
}

class HotelBooking implements BookingService {
    @Override
    public void book() {
        System.out.println("Booking hotel through the travel agent.");
    }
}

class CarRentalBooking implements BookingService {
    @Override
    public void book() {
        System.out.println("Booking car rental through the travel agent.");
    }
}


class TravelAgent {
    private BookingService service;

    public void setBookingService(BookingService service) {
        this.service = service;
    }

    public void bookService() {
        if (service != null) {
            service.book();
        } else {
            System.out.println("No booking service set.");
        }
    }
}


public class travelBooking {
       public static void main(String[] args) {
        TravelAgent agent = new TravelAgent();

        // Book flight through the agent
        BookingService flightBooking = new FlightBooking();
        agent.setBookingService(flightBooking);
        agent.bookService();

        // Book hotel through the agent
        BookingService hotelBooking = new HotelBooking();
        agent.setBookingService(hotelBooking);
        agent.bookService();

        // Book car rental through the agent
        BookingService carRentalBooking = new CarRentalBooking();
        agent.setBookingService(carRentalBooking);
        agent.bookService();
    }
}
