package DesignPattern4;

public class Main {
    public static void main(String[] args) {
        Lion l = new Lion("yellow");
        Giraffe g = new Giraffe("Orange");

        drawAnimal(l);
        drawAnimal(g);

    }

    public static void drawAnimal(Animal a){
        a.draw();
    }
    
}
