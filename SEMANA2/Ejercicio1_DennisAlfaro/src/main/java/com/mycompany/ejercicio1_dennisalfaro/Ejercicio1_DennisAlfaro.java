/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_dennisalfaro;

/**
 *
 * @author MINEDUCYT
 */
    import java.util.Scanner;

public class Ejercicio1_DennisAlfaro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese su ultimo apellido: ");
        String lastName = scanner.nextLine();

        System.out.println("Tu nombre completo es: " + name + " " + lastName);
    }
}
