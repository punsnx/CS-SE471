package DesignPattern5;

public class Number implements Expression{
    private int value;
    public Number(int value){
        this.value = value;
    }
    @Override
    public int getValue() {
        return value;
    }
    
    
}
