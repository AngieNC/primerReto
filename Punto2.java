/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */

import java.util.Scanner;
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        
        while (true){
            System.out.println("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();
            if (contrasena.length()< 8){
                    System.out.println("Tu contraseña necesita mas de 8 caracteres y un numero");
            }
            
            boolean uno = false;
            boolean dos = false;
            boolean tres = false;
            
            for (char definir : contrasena.toCharArray()) {
                if (Character.isLowerCase(definir)) {
                    uno = true;
                } else if (Character.isUpperCase(definir)) {
                    dos = true;
                } else if (Character.isLetterOrDigit(definir)) {
                    tres = true;
                }
            }
            
            if (uno != true) {
                System.out.println("Debes tener sl menos una minuscula en tu contraseña");
            } else if (dos != true) {
                System.out.println("Debes tener al menos una mayuscula en tu contraseña");
            } else if (tres != true) {
                System.out.println("Debes contener al menos un caracter especial como: !, @, #, $, %, &, *, ^ ");
            } else {
                System.out.println("Todo esta bien");
                break;
            }
            
        }
        scanner.close();
    }
    
}
