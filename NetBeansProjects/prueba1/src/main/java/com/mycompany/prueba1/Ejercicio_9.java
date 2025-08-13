/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.1416;
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        
        double perimetro = 2 * PI * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
