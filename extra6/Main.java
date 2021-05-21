/* Ejercicios de ficheros y estructuras - Ejercicio 3*/
package extra6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {

        File file = new File("extra6/texto.txt");
        if(!file.exists()){
            System.out.println("No existe");
            return;
        }

        TreeMap<Integer, Venta> hmap = new TreeMap<>();

        try{
            Scanner fScanner = new Scanner(file);
            String linea;
            String[] parKeyValue;
            Integer codigo, ventas = 0, unidades;
        
            while(fScanner.hasNextLine()){
                linea = fScanner.nextLine();
                parKeyValue = linea.split(" ");
                codigo = Integer.parseInt(parKeyValue[0]);
                unidades = Integer.parseInt(parKeyValue[1]);

                if(!hmap.containsKey(codigo)){
                    hmap.put(codigo, new Venta(1, unidades));
                }
                else{
                    ventas = hmap.get(codigo).getVentas() + 1;
                    unidades = hmap.get(codigo).getUnidades() + unidades;
                    hmap.put(codigo, new Venta(ventas, unidades));
                }  
            }
            fScanner.close();

            for(Integer cod : hmap.keySet()){
                System.out.println(cod +  " Ventas " + hmap.get(cod).getVentas() 
                + ", Unidades " + hmap.get(cod).getUnidades() );
            }


        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        
    }

}
