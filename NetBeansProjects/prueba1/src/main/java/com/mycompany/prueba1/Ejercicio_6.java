/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();
        
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}