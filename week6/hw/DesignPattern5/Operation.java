package DesignPattern5;

class Addition implements Arithmetic {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Subtraction implements Arithmetic {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

class Multiplication implements Arithmetic {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

class Division implements Arithmetic {
    @Override
    public int calculate(int a, int b)  {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
