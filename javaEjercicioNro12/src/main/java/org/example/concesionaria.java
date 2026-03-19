package org.example;

import java.util.Scanner;

public class concesionaria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cantAutos =0;
        int cantAutosPoco =0;
        int cantAutosNuevo =0;
        int cantMuchoUso=0;
        int totalPoco =0;
        int totalNuevo =0;
        int totalMuchoUso=0;
        int antiguedad;
        do{
            System.out.print("ingrese la antiguedad: ");
             antiguedad=sc.nextInt();

             if(antiguedad !=0){
                 cantAutos++;
                 if(antiguedad<=5 && antiguedad>=1){
                     System.out.println("ES NUEVO");
                     cantAutosNuevo++;
                     totalNuevo= totalNuevo + antiguedad;

                 }
                 else if(antiguedad<=10 && antiguedad>=6){
                     System.out.println("TIENE POCO USO");
                     cantAutosPoco++;
                     totalPoco= totalPoco + antiguedad;
                 }
                 else if(antiguedad<=20 && antiguedad>=11){
                     System.out.println("TIENE MUCHO USO");
                     cantMuchoUso++;
                     totalMuchoUso= totalMuchoUso + antiguedad;
                 }
                 else{
                     System.out.println("MUY ANTIGUO");
                 }
             }


        }while (antiguedad != 0);

        System.out.println("Promedio de antigüedad de los autos que no sean muy antiguos es de " +(double) (totalNuevo+totalPoco+totalMuchoUso)/(cantMuchoUso+cantAutosPoco+cantAutosNuevo));
        System.out.println("Cantidad total de autos : "+cantAutos);
        System.out.println("Cantidad de autos con poco uso : "+cantAutosPoco);
    }
}
