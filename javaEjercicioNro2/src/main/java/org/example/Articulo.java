package org.example;

import java.util.Scanner;

public class Articulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el precio del producto");
        double precioArticulo = sc.nextDouble();

        double iva = 1.21;

        double precioTotal = precioArticulo*iva;
        System.out.println("El precio del articulo con el iva es: "+precioTotal);

        sc.close();

    }
}
