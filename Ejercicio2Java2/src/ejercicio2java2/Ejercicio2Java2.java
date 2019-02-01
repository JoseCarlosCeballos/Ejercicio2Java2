/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2java2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio2Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia;
        int diaint = 0;
        String hora;
        int horadia;
        String minuto;
        int minutodia;
        int minutosfin;
        
        String[] parts;
        String part1;
        String part2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = sc.nextLine().toUpperCase();
        switch(dia){
            case "LUNES":
                diaint = 0;
                break;
            case "MARTES":
                diaint = 1;
                break;
            case "MIERCOLES":
                diaint = 2;
                break;
            case "JUEVES":
                diaint = 3;
                break;
            case "VIERNES":
                diaint = 4;
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("Ya estas en el fin de semana");
                break;
            default: 
                System.out.println("No sabes los dias de la semana o no sabes escribir");
                break;
        }
        do{
        System.out.println("Introduce la hora: ");
        hora = sc.nextLine();
        
        parts = hora.split(":");
        part1 = parts[0];
        part2 = parts[1];
            
        horadia = Integer.parseInt(part1);
        minutodia = Integer.parseInt(part2);
        }while(horadia > 23 || horadia < 0 || minutodia > 23 || minutodia < 0);
        
        horadia = horadia*60;
        minutosfin = (6660 -((diaint*24*60) + (horadia + minutodia)));
        if (minutosfin < 0){
            System.out.println("Ya estas en el fin de semana");
        }else
            System.out.println("Faltan " +minutosfin+ " minutos para el fin de semana");
        
    }
    
}
