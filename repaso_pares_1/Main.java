/**
 * 1.- Realiza un programa que lea desde teclado 26 números enteros, 
 * para posteriormente mostrar solo los pares en
orden ascendente y sin repetir. <>
 */

package repaso_pares_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean repetido;
        int cont = 0;
        int apunt = 0;
        int aux;
        final int NUM = 10;
        int[] paresSinRepetir = new int[NUM];

        while(cont < NUM){
            System.out.println("Numero");
            aux = sc.nextInt();
            cont++;
            repetido = false;
            for(int i = 0; i < apunt && !repetido; i++){
                if(aux == paresSinRepetir[i]){
                    repetido = true;
                }
            }
            if(!repetido){
                paresSinRepetir[apunt] = aux;
                apunt++;
            }
        }
        sc.close();
        int[] auxPares = soloPares(paresSinRepetir);
        ordenarAsc(auxPares);
        System.out.println("Pares sin repetir ordenados ascendentemente:");
        // Me he ahorrado el 0
        for(int i = 0; i < auxPares.length; i++){
            if(auxPares[i] != 0){
                System.out.print(auxPares[i] + " "); 
            }
        }   
    }

    private static int[] soloPares(int[] arr){
        int contPares = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                contPares++;
            }
        }
        int[] pares = new int[contPares];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                pares[k] = arr[i];
                k++;
            }
        }
        return pares;
        
    }
    
    private static void ordenarAsc(int[] arr){
        int aux;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    
}