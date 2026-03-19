package org.example;

import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma = 0;
        System.out.println("Digite un numero: ");
        int numero=sc.nextInt();
        while(numero <0 ){
           System.out.println("ingrese un numero positivo porfavor");
           numero=sc.nextInt();

        }
        suma = suma + numero;
        System.out.println("el numero es : "+suma);
        sc.close();
    }
}
