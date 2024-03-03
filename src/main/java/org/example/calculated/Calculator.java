package org.example.calculated;

import java.text.DecimalFormat;

public class Calculator {
    public static double operationNumber(String expression) {

        double num1,num2;
        double result = 0;
        String[] parts = expression.split(" ");
        num1 = Double.parseDouble(parts[0]);
        String ch = parts[1];
        num2 = Double.parseDouble(parts[2]);
        // Форматирование вывода результата
        DecimalFormat df = new DecimalFormat("0.0000");
        if(ch.equals("+")) {
            // Сложение чисел
            result = num1 + num2;
        } else if (ch.equals("-")) {
            result = num1 - num2;
        } else if (ch.equals("/")) {
            result = num1 / num2;
            if(num2==0)
            {
                System.out.println("На 0 делить нельзя");
            }
        } else if (ch.equals("*")) {
            result = num1 * num2;
        }
        else {
            System.out.println("Неверная операция");
        }
        // Округление результата до 4-х знаков после запятой
        result = Math.round(result * 10000) / 10000.0;

        // Вывод результата
        System.out.println("Результат: " + df.format(result));

        return result;
    }
}
