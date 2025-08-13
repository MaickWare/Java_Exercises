/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kg: ");
        double peso = input.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = input.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.printf("Su Índice de Masa Corporal es: %.2f%n", imc);
    }
}
