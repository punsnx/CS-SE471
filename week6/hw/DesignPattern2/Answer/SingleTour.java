package DesignPattern2.Answer;

public class SingleTour extends DefaultTour{
    public SingleTour(String name, double price, int available) {
        super(name, price, available);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailable() {
        return available - reservedSeats;
    }


}
