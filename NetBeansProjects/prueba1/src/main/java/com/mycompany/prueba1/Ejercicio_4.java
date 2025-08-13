/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo: ");
        double dividendo = lector.nextDouble();
        
        System.out.print("Ingrese el divisor: ");
        double divisor = lector.nextDouble();
        
        if (divisor != 0) {
            double cociente = dividendo / divisor;
            System.out.println("El resultado de la división es: " + cociente);
        } else {
            System.out.println("Error: No se puede dividir por cero");
        }
    }
}
