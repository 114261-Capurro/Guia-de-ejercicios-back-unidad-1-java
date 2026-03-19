package org.Alquileres;

import java.util.Scanner;

public class Alquileres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite la cantidad de km realizados");
        int km=sc.nextInt();
        int kmExtra;
        if(km <= 200){
            System.out.println("El alquiler sale $300");

        }
        else if(km <= 1000){
            kmExtra = km - 200;
            System.out.println("El alquiler sale $" + (kmExtra * 5 + 300));

        }
        else{
            kmExtra = km - 1000;
            System.out.println("El alquiler sale $" + (kmExtra * 10 + 300 + 4000));
        }
        sc.close();
    }
}
