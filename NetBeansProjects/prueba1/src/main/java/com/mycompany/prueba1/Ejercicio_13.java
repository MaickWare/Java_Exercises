/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();
        
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.printf("El promedio de las notas es: %.2f%n", promedio);
    }
}