/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*El funcionamiento consiste en que primero se asignan valores a las
        variables declaradas, y se recorre una variable i con valor 0 hasta el 10
        y se imprime los numeros que se van sumando, es decir el anterior se le suma 
        al que sigue y asi sucesivamente hasta que sean 10 numeros en total que es el
        rango determminado, pero con un espacio intermedio. 
        Se definen las variables con el resultado de la otra o de una operacion,
        por ejemplo, la variable a se le asignan los valores de b y la variable b conlleva
        la suma entre los valores de a y los de b. Al final no se imprime nada, pero ello
        estaba en el punto*/
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            a = b;
            b = (a+b);
        }
        System.out.println();
    }
    
}
