/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que calcule la suma de todos los numeros que son multiplos de 3 o 5 y que sean menores que un numero dado N. Ecluir aquellos que son multiplos de ambos 3 y 5.*/

        Scanner scanner = new Scanner(System.in);
        int limite, primerN, segundoN, primerR, segundoR;
        int suma = 0;
        primerN = 3;
        segundoN = 5;

        do {
            System.out.println("Ingresa un numero limite: ");
            limite = scanner.nextInt();

            if (primerN >= limite) {
                System.out.println("Ingresa otro numero");
            } else if (segundoN >= limite) {
                System.out.println("Ingresa otro numero");
            }

        } while (primerN >= limite || segundoN >= limite);
        
        System.out.println("Los multiplos de 3 son: ");
        
        
            for (int i = 1; i < limite; i++) {
            if (i % 3 == 0) {
                primerR = i;
                suma += i;
                System.out.println(primerR);
            }
        }
        System.out.println("*******************");
        System.out.println("Los multiplos de 5 son: ");
        for (int x = 1; x < limite; x++) {
            if (x % 5 == 0) {
                segundoR = x;
                suma += x;
                System.out.println(segundoR);
            }
        }
        System.out.println("La suma total de los multiplos antes de " + limite + " es: " + suma);
        scanner.close();

    }

}
