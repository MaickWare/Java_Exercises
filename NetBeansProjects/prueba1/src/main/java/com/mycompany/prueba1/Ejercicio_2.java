/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el primer valor: ");
        double valor1 = entrada.nextDouble();
        
        System.out.print("Introduzca el segundo valor: ");
        double valor2 = entrada.nextDouble();
        
        double diferencia = valor1 - valor2;
        System.out.println("El resultado de la resta es: " + diferencia);
    }
}
