package DesignPattern5;

import java.util.ArrayList;
import java.util.List;

public class Operand implements Expression{
    private List<Expression> expressions;
    private Arithmetic operation;

    public Operand(Arithmetic operation){
        this.expressions = new ArrayList<>();
        this.operation = operation;
    }

    @Override
    public int getValue()  {
        if (expressions.size() < 2) throw new ArithmeticException("Operand less than 2");
        
        int result = expressions.get(0).getValue();
        for (int i = 1; i < expressions.size(); i++) {
            result = operation.calculate(result, expressions.get(i).getValue());
        }
        return result;
    }

    public void addExp(Expression e){
        expressions.add(e);

    }



    
}
