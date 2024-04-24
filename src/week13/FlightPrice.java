package week13;

public class FlightPrice  implements Cost<Flight>{
    public double cost(Flight flight){
        return flight.getPrice();
    }
}

