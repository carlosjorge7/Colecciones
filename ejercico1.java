/** 
 * 1.- Programa que lea números enteros hasta que se meta uno repetido 3 veces.
 */
package extra1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numeros = new LinkedList<>();
        int cont = 0;
        boolean repetido; 
       
        while(cont < 3){
            System.out.println("Numero : ");
            int numero = sc.nextInt();
            numeros.add(numero);

            for(int i = 0, j = numeros.size() - 1; i < numeros.size() && i !=j ; i++, j--){
                if(numeros.get(i) == numeros.get(j)){
                    cont++;
                }
            }
        }
        
        sc.close();
        System.out.println("Has metido un numero 3 veces");

    }
}