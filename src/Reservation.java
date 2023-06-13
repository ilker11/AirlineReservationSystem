public class Reservation {
    private Flight flight;
    private Passenger passenger;
    private boolean isConfirmed;

    public Reservation(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger =  passenger;
        this.isConfirmed = false;
    }

    public void confirmReservation(){
        if(flight.checkSeatAvailability()) {
            flight.bookSeat();
            isConfirmed = true;
            System.out.println("Reservation confirmed for passenger " + passenger.getName());

        }
        else {
            System.out.println("Reservation failed. No seats available");
        }
    }

    public void cancelReservation(){
        if(isConfirmed){
            flight.incrementAvailableSeats();
            isConfirmed = false;
            System.out.println("Reseration canceled for passenger " + passenger.getName());
        }
        else {
            System.out.println("No reservation to cancel for passenger " + passenger.getName());
        }
    }
}
