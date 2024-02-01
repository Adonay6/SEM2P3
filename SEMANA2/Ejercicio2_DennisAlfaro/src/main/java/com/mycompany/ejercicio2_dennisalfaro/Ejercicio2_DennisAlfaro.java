/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_dennisalfaro;

/**
 *
 * @author MINEDUCYT
 */

    import java.util.Scanner;

public class Ejercicio2_DennisAlfaro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer valor: ");
        double valor3 = scanner.nextDouble();

        double suma = valor1 + valor2 + valor3;
        double diferencia = valor1 - valor2 - valor3;
        double producto = valor1 * valor2 * valor3;

        System.out.println("La suma de los tres valores es: " + suma);
        System.out.println("La resta de los tres valores es: " + diferencia);
        System.out.println("El producto de los tres valores es: " + producto);

        scanner.close();
    }
}