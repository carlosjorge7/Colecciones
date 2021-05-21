/* Ejercicios de ficheros y estructuras - Ejercicio 1*/

package extra4;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        File file = new File("extra4/texto.txt");
        if(!file.exists()){
            System.out.println("No existe");
            return;
        }

        ArrayList<String> alist = new ArrayList<>();
        
        try{
            Scanner fScanner = new Scanner(file);
            String linea;
           
            while(fScanner.hasNextLine()){
                linea = fScanner.nextLine();
                alist.add(linea);
            }
            fScanner.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i = alist.size() - 1; i >= 0; i--){
                bw.write(alist.get(i) + "\r\n");
            }
            bw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Fichero no encontrado");
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error al escribir");
        }
  
    }

}
