package org.example.massive;

import java.util.Scanner;

public class massive {
    public static void workMassive(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива:");
        int arraySize = scanner.nextInt();

        String[] array = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите" + (i + 1) + "слово :");
            array[i] = scanner.next();
        }

        String longString = array[0];

        for (int i = 1; i < arraySize; i++) {
            if (array[i].length() > longString.length()) {
                longString = array[i];
            }
        }

        System.out.println("Самое длинное слово: " + longString);
    }
}
