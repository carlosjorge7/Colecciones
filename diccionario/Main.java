package diccionario;

import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        
        File file = new File("diccionario/palabrasDiccionario.txt");
        if(!file.exists()){
            System.out.println("No existe el fichero");
            return;
        }

        TreeMap<String, Integer> tmap = new TreeMap<>();

        try{
            Scanner fScanner = new Scanner(file);
            String linea;
            String[] palabras;
            while(fScanner.hasNextLine()){
                linea = fScanner.nextLine();
                palabras = linea.split(" ");
                for(String pal : palabras){
                    if(!tmap.containsKey(pal)){
                        tmap.put(pal, 1);
                    }
                    else{
                        tmap.put(pal, tmap.get(pal) + 1);
                    }
                }
            }
            fScanner.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("diccionario/diccionarioOrdenado.txt")));
            for(String tm : tmap.keySet()){
                for(int i = 0; i < tmap.get(tm); i++){
                    bw.write(tm + "\r\n");
                } 
            }
            bw.close();


        }
        catch(FileNotFoundException e){
            System.out.println("Error de lectura");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Error de escritura");
            e.printStackTrace();

        }
    }


    
}