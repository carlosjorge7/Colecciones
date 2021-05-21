/* Ejercicios de ficheros y estructuras - Ejercicio 2*/

package extra5;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        File file = new File("extra5/ventas.txt");
        if(!file.exists()){
            System.out.println("No existe");
            return;
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        try{
            Scanner fScanner = new Scanner(file);
            String linea;
            String[] parKeyValue;
            Integer codigo, unidades;

            while(fScanner.hasNextLine()){
                linea = fScanner.nextLine();
                parKeyValue = linea.split(" ");
                codigo = Integer.parseInt(parKeyValue[0]);
                unidades = Integer.parseInt(parKeyValue[1]);

                if(!hmap.containsKey(codigo)){
                    hmap.put(codigo, unidades);
                }
                else{
                    hmap.put(codigo, hmap.get(codigo) + unidades);
                }   
            }
            fScanner.close();
            Integer mayorUnidades = Integer.MIN_VALUE;

            for(Integer cod: hmap.keySet()){
                if(hmap.get(cod) > mayorUnidades){
                    mayorUnidades = hmap.get(cod);
                }
            }
            System.out.println("Producto(s) con mayor stock : ");
            for(Integer cod: hmap.keySet()){
                if(hmap.get(cod) == mayorUnidades){
                    System.out.println("Producto más vendido: " +  cod + " con " +  mayorUnidades + " unidades ");
                }
            }
  
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }

}
