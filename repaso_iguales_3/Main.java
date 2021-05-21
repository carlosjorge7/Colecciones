/**
 * 3.- Completa este método estático, 
 * que nos indica si un array contiene los dos números enteros indicados o no:
 * <>
 */

package repaso_iguales_3;

public class Main {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean contiene = contiene(numeros, 1, 2);
        System.out.println(contiene);
    }

    public static boolean contiene(int[] numeros, int x, int y){
        if(x == y){
            return contieneUno(numeros, x);
        }
        else{
            return contieneUno(numeros, x) && contieneUno(numeros, y);
        }
    }

    public static boolean contieneUno(int[] numeros, int x){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == x){
                return true;
            }
        }
        return false;
    }  
}