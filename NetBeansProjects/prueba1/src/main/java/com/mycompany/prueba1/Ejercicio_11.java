/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca el valor de A: ");
        int a = input.nextInt();
        
        System.out.print("Introduzca el valor de B: ");
        int b = input.nextInt();
        
        // Intercambio usando variable temporal
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Después del intercambio:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}