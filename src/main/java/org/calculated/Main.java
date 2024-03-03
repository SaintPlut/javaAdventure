package org.calculated;
import java.util.Scanner;
import static org.calculated.Calculator.operationNumber;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение через пробел:");
        String expression = scanner.nextLine();
        operationNumber(expression);
    }
}

