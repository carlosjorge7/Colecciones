package the_trooper;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        /**
         *  Scanner sc = new Scanner(System.in);
            System.out.println("Nombre del fichero: ");      
            File file = new File(sc.nextLine());
            sc.close();
         */

        File file = new File("the_trooper/the_trooper.txt");
        if(!file.exists()){
            System.out.println("No existe");
            return;
        }
        ArrayList<String> aList = new ArrayList<>(); 
        try{
          Scanner fScanner = new Scanner(file);
          String linea;
          String[] palabras;
          BufferedWriter bw = new BufferedWriter(new FileWriter(new File("the_trooper/the_trooper1.txt")));

          while(fScanner.hasNextLine()){
            linea = fScanner.nextLine();
            palabras = linea.split(" ");
            for(String p : palabras){
                aList.add(p);
            }
            Collections.sort(aList);
            for(String a : aList){
                bw.write(a + " ");
            }
            bw.write("\r\n");
            aList.clear();
          }
          fScanner.close();
          bw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error de escritura");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Error de escritura");
            e.printStackTrace();
        }
        
    }
    
}