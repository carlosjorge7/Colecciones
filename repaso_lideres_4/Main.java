/**
 * 4.- Completa este método estático,que imprime por consola todos 
 * los números del array de entrada que son líderes. Un
número es líder si no tiene ninguno que lo supere a su derecha.
 */

package repaso_lideres_4;

public class Main {

    public static void main(String[] args) {
        int[] numeros = {23, 45, 66, 5, 27, 4, 2};
        int[] lideres = imprimeLideres(numeros);
        for(int l : lideres){
            System.out.print(l + " ");
        }
        // el ulimo siempre es lider
        System.out.print(numeros[numeros.length - 1]);
    }

    public static int[] imprimeLideres(int[] numeros){
        int cont = 0;
        for(int i = 0; i < numeros.length - 1; i++){
            if(numeros[i] > numeros[i+1]){
                cont++;
            }
        }
        int[] lideres = new int[cont];
        int k = 0;
        for(int i = 0; i < numeros.length - 1; i++){
            if(numeros[i] > numeros[i+1]){
                lideres[k] = numeros[i];
                k++;
            }
        }
        return lideres;
    }
    
}