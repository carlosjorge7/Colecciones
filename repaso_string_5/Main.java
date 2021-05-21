/**
 * 5.- Realiza un programa que lea cadenas de caracteres desde teclado
 *  hasta que se introduzcan 20, o bien hasta que se
introduzca una cadena repetida.
 */

package repaso_string_5;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean repetida = false;
        final int NUM = 20;
        String cadena;
        String[] cadenas = new String[NUM];
        int cont = 0;

        while(cont < NUM && !repetida){
            System.out.println("Cadena : ");
            cadena = sc.nextLine();

            for(int i = 0; i < cadenas.length && !repetida; i++){
                if(cadena.equals(cadenas[i])){
                    repetida = true;
                }
            }

            if(!repetida){
                cadenas[cont] = cadena;
                cont++;
            }
        }
        sc.close();

    }
}