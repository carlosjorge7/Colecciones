/**
 * 3.- Programa que lea cadenas de caracteres hasta que introduzca “fin”. Al acabar las mostrará
ordenadas alfabéticamente, todas en mayúscula y con repetidas si las hubiera.
 */
package extra3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadena : ");
        String cadena = sc.nextLine();

        while(!cadena.equals("fin")){
            cadenas.add(cadena);
            System.out.println("Cadena : ");
            cadena = sc.nextLine();
        }
        sc.close();
        Collections.sort(cadenas);
        System.out.println("Cadenas ordenadas, en mayusculas y con repes");
        for(String cad : cadenas){
            System.out.println(cad.toUpperCase());
        }
    }
}