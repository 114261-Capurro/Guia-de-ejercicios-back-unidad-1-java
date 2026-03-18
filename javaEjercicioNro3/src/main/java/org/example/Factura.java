package org.example;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Digite el precio del primer producto");
       int preProducto1 = sc.nextInt();
       System.out.println("Digite el precio del segundo producto");
       int preProducto2 = sc.nextInt();
       System.out.println("Digite el precio del tercer producto");
       int preProducto3 = sc.nextInt();


        System.out.println("El total del producto es: " + (preProducto1 + preProducto2 + preProducto3));

        sc.close();
    }
}
