package org.example.calculated;

import java.text.DecimalFormat;

public class Expression {
    private String expression;
    private double result;

    public Expression(String expression) {
        this.expression = expression;
    }

    public double calculate() {
        String[] parts = expression.split(" ");
        double num1 = Double.parseDouble(parts[0]);
        String ch = parts[1];
        double num2 = Double.parseDouble(parts[2]);

        DecimalFormat df = new DecimalFormat("0.0000");
        if (ch.equals("+")) {
            result = num1 + num2;
        } else if (ch.equals("-")) {
            result = num1 - num2;
        } else if (ch.equals("/")) {
            if (num2 == 0) {
                System.out.println("На 0 делить нельзя");
                return 0;
            }
            result = num1 / num2;
        } else if (ch.equals("*")) {
            result = num1 * num2;
        } else {
            System.out.println("Неверная операция");
            return 0;
        }

        result = Math.round(result * 10000) / 10000.0;
        System.out.println("Результат: " + df.format(result));
        return result;
    }
}
