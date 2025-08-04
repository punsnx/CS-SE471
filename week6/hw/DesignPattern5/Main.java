package DesignPattern5;

public class Main {
    public static void main(String[] args) {
        
        // (32 - (8 + ((4/2) * 6))) - 10
        Number num32 = new Number(32);
        Number num8 = new Number(8);
        Number num4 = new Number(4);
        Number num2 = new Number(2);
        Number num6 = new Number(6);
        Number num10 = new Number(10);
        
        // (4/2)
        Operand division = new Operand(new Division());
        division.addExp(num4);
        division.addExp(num2);
        
        // ((4/2) * 6)
        Operand multiplication = new Operand(new Multiplication());
        multiplication.addExp(division);
        multiplication.addExp(num6);
        
        // (8 + ((4/2) * 6))
        Operand addition = new Operand(new Addition());
        addition.addExp(num8);
        addition.addExp(multiplication);
        
        // (32 - (8 + ((4/2) * 6)))
        Operand subtraction1 = new Operand(new Subtraction());
        subtraction1.addExp(num32);
        subtraction1.addExp(addition);
        
        // (32 - (8 + ((4/2) * 6))) - 10
        Operand subtraction2 = new Operand(new Subtraction());
        subtraction2.addExp(subtraction1);
        subtraction2.addExp(num10);
        
        System.out.println("(32 - (8 + ((4/2) * 6))) - 10 = " + subtraction2.getValue());
    }
}
