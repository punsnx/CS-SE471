package DesignPattern4;

public class Lion extends Animal{
    public Lion(String color){
        super(color);
    }

    @Override
    public void drawHead() {
        System.out.println("Lion Head");
    }

    @Override
    public void drawBody() {
        System.out.println("Lion Body");
    }

    

    
}
