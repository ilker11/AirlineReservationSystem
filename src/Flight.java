public class Flight {
    private String flightNumber;
    private int totalSeats;
    private int availableSeats;

    public Flight(String flightNumber, int totalSeats) {
        this.flightNumber = flightNumber;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean checkSeatAvailability(){
        return availableSeats > 0;
    }

    public void bookSeat(){
        if (checkSeatAvailability()){
            availableSeats--;
            System.out.println("Seat booked succesfully!");

        }
        else {
            System.out.println("No seats available on this flight!");
        }
    }

    public void incrementAvailableSeats() {
        if (availableSeats < totalSeats) {
            availableSeats++;
        }
    }
}
