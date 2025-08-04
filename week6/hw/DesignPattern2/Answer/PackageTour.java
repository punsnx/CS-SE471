package DesignPattern2.Answer;

import java.util.ArrayList;
import java.util.List;

public class PackageTour extends DefaultTour{
    List<Tour> tours = new ArrayList<>();

    public PackageTour(String name) {
        super(name, 0, 0);
    }

    public void addTour(Tour t){
        tours.add(t);
    }

    @Override
    public double getPrice(){
        double total = 0;
        for(Tour t: tours){
            total += t.getPrice();
        }
        return total * 0.9;
    }

    @Override
    public int getAvailable(){
        if(tours.isEmpty())return 0;
        int min = tours.getFirst().getAvailable();
        for(Tour t: tours){
            if(t.getAvailable() < min) min = t.getAvailable();
        }
        return min;
    }

}
