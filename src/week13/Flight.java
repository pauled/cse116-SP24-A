package week13;

public class Flight <T> extends Edge<T>{
    private double price;
    private int distance;
    private double time;

    public Flight(T start, T end, double price, int distance, double time) {
        super(start, end);
        this.price = price;
        this.distance = distance;
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public int getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
}
