package DesignPattern2;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements  Tour{
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(Tour t: tours){
            total += t.getPrice();
        }
        return total * 0.9;
    }

    @Override
    public int getAvailable() {
        if(tours.isEmpty())return 0;
        int min = tours.getFirst().getAvailable();
        for(Tour t: tours){
            if(t.getAvailable() < min) min = t.getAvailable();
        }
        return min;
    }
}
