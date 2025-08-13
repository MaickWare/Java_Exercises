/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba el primer factor: ");
        float factor1 = sc.nextFloat();
        
        System.out.print("Escriba el segundo factor: ");
        float factor2 = sc.nextFloat();
        
        float producto = factor1 * factor2;
        System.out.println("El producto de la multiplicación es: " + producto);
    }
}
