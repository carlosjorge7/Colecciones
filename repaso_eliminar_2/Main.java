/**
 * 2.- Completa este método estático, 
 * que devuelve un array con los números del array de entrada, pero eliminando todas
las apariciones del número a eliminar: <>
 */

package repaso_eliminar_2;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 7, 6, 22, 1, 0, 1, 8 , 8, 1};
        int[] eliminados = elimina(array, 1);
        for(int e : eliminados){
            System.out.print(e + " ");
        }
    }

    public static int[] elimina(int[] numeros, int elimina){
        int cont = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == elimina){
                cont++;
            }
        }
        int[] eliminados = new int[numeros.length - cont];
        int k = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] != elimina){
                eliminados[k] = numeros[i];
                k++;
            }
        }
        return eliminados;
    }   
}