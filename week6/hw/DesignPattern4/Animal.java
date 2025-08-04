package DesignPattern4;

public abstract class Animal {
    String color;
    public Animal(String color){
        this.color = color;
    }
    public void draw(){
        
    }
    public abstract void drawHead();
    public abstract void drawBody();
    public void drawLeg(){
        System.out.println("THIS IS ANIMAL LEG");
    }
}
