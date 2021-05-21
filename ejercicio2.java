/**
 * 2.- Programa que lea números enteros hasta que se meta uno repetido.
 */

package extra2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        HashSet<Integer> numeros = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int cont = 1;

        while(cont < 2){
            System.out.println("Numero : ");
            int num = sc.nextInt();

            if(!numeros.add(num)){
                cont++;
            }
        }
        sc.close();
        System.out.println("Se ha metido un numero repetido");
    }
}