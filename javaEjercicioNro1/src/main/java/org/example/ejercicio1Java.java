package org.example;

import java.util.Scanner;

public class ejercicio1Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite el primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplica: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

         sc.close();
    }

}
