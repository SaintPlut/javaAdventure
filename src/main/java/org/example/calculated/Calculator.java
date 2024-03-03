package org.example.calculated;

import java.text.DecimalFormat;

public class Calculator {
    public static double operationNumber(String expression) {
        try {
            Expression expressionObject = new Expression(expression);
            return expressionObject.calculate();
        } catch (Exception e) {
            System.out.println("Ошибка в выражении, значения введены не через пробел. " + e);
            return 0;
        }
    }
}
