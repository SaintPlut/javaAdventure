package org.example;
import java.util.Scanner;
import static org.example.calculated.Calculator.operationNumber;
import static org.example.massive.massive.workMassive;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите номер задания 1-калькулятор, 2-массив");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number==1)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите выражение через пробел:");
            String expression = scan.nextLine();
            operationNumber(expression);
        } else if (number==2) {
            workMassive();
        }
        else
            System.out.println("Номер задания некорректный");
    }
}

