/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese los grados Celsius");
         int celsius = leer.nextInt();
         double fahrenheit = 32 + (9.0 / 5) * celsius;
         System.out.println("El equivalente en grados Fahrenheit es:" + fahrenheit);
     }
        
}
