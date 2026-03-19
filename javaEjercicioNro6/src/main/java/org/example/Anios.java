package org.example;

import java.util.Scanner;

public class Anios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un año");
        int anio = sc.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
        sc.close();

    }
}
