/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca la base del rectángulo: ");
        double base = input.nextDouble();
        
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = input.nextDouble();
        
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
