/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas esta semana: ");
        int horas = sc.nextInt();
        
        System.out.print("Ingrese el pago por hora: ");
        double pagoHora = sc.nextDouble();
        
        double salario = horas * pagoHora;
        System.out.println("Su salario semanal es: $" + salario);
    }
}
