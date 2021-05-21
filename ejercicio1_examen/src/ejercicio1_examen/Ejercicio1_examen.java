
package ejercicio1_examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;



public class Ejercicio1_examen {

    
    public static void main(String[] args){
        
        TreeSet<String> tpalabras = new TreeSet<>();
        TreeSet<Integer> tnumeros = new TreeSet<>();
                
        try{
            
            File file = new File("/home/carletes/Documentos/fichero.txt");
            Scanner sc = new Scanner(file);
            String linea;
            
            while(sc.hasNextLine()){
                
                linea = sc.nextLine();
                try{
                    tnumeros.add(Integer.parseInt(linea));
                }
                catch(NumberFormatException e){
                    //e.printStackTrace();
                    tpalabras.add(linea);
                }
                
            } 
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        System.out.println("Numeros sin repetir y ordenados");
        mostrarNumeros(tnumeros);
        
        System.out.println("Palabras sin repetir y ordenadas");
        mostrarPalabras(tpalabras);
    }
    
    private static void mostrarNumeros(TreeSet<Integer> tnumeros){
        
        for(Integer tn : tnumeros){
            System.out.println(tn);
        }
    }
    
    private static void mostrarPalabras(TreeSet<String> tpalabras){
        
        for(String tp : tpalabras){
            System.out.println(tp);
        }
    }
    
}
