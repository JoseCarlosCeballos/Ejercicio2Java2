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
        int hora;
        int minuto;
        int segundo;
        int fin;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = sc.nextLine();
        System.out.println("Introduce la hora: ");
        hora = sc.nextInt();
        System.out.print(":");
        minuto = sc.nextInt();
        System.out.print(":");
        segundo = sc.nextInt();
    }
    
}
