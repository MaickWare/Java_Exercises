/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159265359;
        
        System.out.print("Digite el radio del círculo: ");
        double radio = entrada.nextDouble();
        
        double area = PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}
