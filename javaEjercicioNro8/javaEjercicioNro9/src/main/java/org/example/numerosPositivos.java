package org.example;

import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numeroMayor = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("ingrese un numero");
            int numero = sc.nextInt();

            if(numero >5){
                numeroMayor++;
            }
        }
        System.out.println("la cantidad de numeros mayores a 5 es de : "+numeroMayor);

    }
}
