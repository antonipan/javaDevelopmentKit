package ru.anton.homework03;

public class Calculator {

    public static <T extends Number> Number sum (T numX, T numY) {
        return numX.floatValue() + numY.floatValue();
    }

    public static <T extends Number> Number multiply (T numX, T numY) {
        return numX.doubleValue() + numY.doubleValue();
    }

    public static <T extends Number> Number divide (T numx, T numY) {
        if (numY.doubleValue() == 0) {
            throw new ArithmeticException("Деление на 0 невозможно... ");
        }
        return numx.doubleValue()/numY.doubleValue();
    }

    public static <T extends Number> Number subtract (T numX, T numY) {
        return numX.doubleValue() - numY.doubleValue();
    }

}
