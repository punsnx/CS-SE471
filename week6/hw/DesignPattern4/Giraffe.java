package DesignPattern4;

public class Giraffe extends Animal{
    public Giraffe(String color){
        super(color);
    }

    @Override
    public void drawHead() {
        System.out.println("Giraffe Head");
    }

    @Override
    public void drawBody() {
        System.out.println("Giraffe Body");
    }

    

    
}
