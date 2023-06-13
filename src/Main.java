public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("102", 20);
        Passenger passenger1 = new Passenger("John");
        Reservation reservation1 = new Reservation(flight1, passenger1);

        reservation1.confirmReservation();
      //  reservation1.cancelReservation();



    }
}