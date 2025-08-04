package DesignPattern2.Answer;

public class Main {
    public static void main(String[] args) {
        SingleTour tour1 = new SingleTour("Tour 1", 100, 10);
        SingleTour tour2 = new SingleTour("Tour 2", 200, 20);
        PackageTour packageTour = new PackageTour("Special Tour!");
        packageTour.addTour(tour1);
        packageTour.addTour(tour2);

        tourInfo(tour1);
        tourInfo(tour2);
        tourInfo(packageTour);
    }

    public static void tourInfo(DefaultTour tour){
        System.out.println(tour.getName());
        System.out.println(tour.getPrice());
        System.out.println(tour.getAvailable());
    }
}
