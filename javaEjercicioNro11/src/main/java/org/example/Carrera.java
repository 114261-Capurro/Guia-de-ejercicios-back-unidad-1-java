package org.example;

import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg;
        int cantCorredor = 1;
        System.out.print("Ingrese el tiempo del ganador: ");
        int tiempoGanador = sc.nextInt();

        double limite = (tiempoGanador * 1.15);
        for (int i = 0; i < 9; i++) {
            System.out.println("ingrese la cantidad de segundos");
            seg = sc.nextInt();
              if(seg <= limite){
                  cantCorredor++;
              }
        }
        System.out.println("Podran competir "+ cantCorredor +" pilotos");
        sc.close();
    }
}
