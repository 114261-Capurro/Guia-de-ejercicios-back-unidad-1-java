package org.example;

import java.util.Scanner;

public class Empleado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("ingrese el sueldo que cobra por hora");
        double sueldo = sc.nextDouble();
        if(horas > 180){
            System.out.println("Le corresponde un aumento del 50% por lo tanto el sueldo es: "+ (sueldo*1.5));
        }else{
            System.out.println("No le corresponde ningun aumento, su sueldo sigue siendo "+ sueldo);
        }
         sc.close();
    }
}
