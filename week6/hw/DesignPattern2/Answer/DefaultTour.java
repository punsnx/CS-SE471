package DesignPattern2.Answer;

public abstract  class DefaultTour implements Tour {
    protected String name;
    protected double price;
    protected int available;
    protected int reservedSeats;

    public DefaultTour(String name, double price, int available) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.reservedSeats = 0;
    }

    @Override
    public String getName() {
        return name;
    }

}
