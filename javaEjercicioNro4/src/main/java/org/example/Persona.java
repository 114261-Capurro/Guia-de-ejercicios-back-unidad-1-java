package org.example;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre1=sc.nextLine();
        System.out.println("Digite su altura");
        float altura1=sc.nextFloat();

        sc.nextLine();

        System.out.println("Digite el nombre de la segunda persona");
        String nombre2=sc.nextLine();
        System.out.println("Digite la altura de la segunda persona");
        float altura2=sc.nextFloat();

        if(altura1>altura2){
            System.out.println(nombre1+ " tiene una altura mayor a " + nombre2);
        }
        else if(altura1<altura2){
            System.out.println(nombre2+ " tiene una altura mayor a " + nombre1);
        }
        else{
            System.out.println(nombre1+ " tiene la misma altura que " + nombre2);
        }
        sc.close();
    }
}
