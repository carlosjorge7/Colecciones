/**
 * 7.- Completa este método estático, que nos indica si un array bidimensional es “equis”. 
 * Un array bidimensional es
“equis” si el número de filas y columnas es el mismo y si todas las casillas 
de las dos diagonales contienen el mismo
número.
 */

package repaso_equis_7;

public class Main{

    public static void main(String[] args) {


        int[][] matriz = {{8, 6, 8}, {9, 8, 1}, {8, 5, 8}};

        if(esEquis(matriz)){
            System.out.println("Matriz tipo X");
        }
        else{
            System.out.println("No es matriz tipo X");
        }

    }

    public static boolean esEquis(int[][] numeros){

        int cont = numeros[0][0];
        boolean equis = false;
        if(numeros.length != numeros[0].length){
            equis = false;
        }
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; i++){
                if(i == j){
                    if(cont == numeros[i][i]){
                        equis = true;
                    }
                }
            }
        }

        int fil = 0;
        int col = numeros[0].length;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[fil][col] == numeros[fil++][col--]){
                equis = true;
            }
        }
        return equis;
    }
}