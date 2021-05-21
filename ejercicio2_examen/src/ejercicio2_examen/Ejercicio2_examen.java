
package ejercicio2_examen;

import java.util.HashSet;
import java.util.Scanner;
import java.io.IOException;


public class Ejercicio2_examen {

    
    public static void main(String[] args) {
       
        HashSet<String> hpalabras = new HashSet<>();
        String palabra;
        int cont = 1; //Porque cada palabra va a estar min 1 vez
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Palabra");
            palabra = sc.nextLine();
            
            try{
                //Si no puedo añadirla, implica que ya existe en el Set y sumo uno al cont
                if(!hpalabras.add(palabra))
                    cont++;
            }
            catch(Exception e){
                e.printStackTrace();
            }   
        }
        while(cont < 3);
          
        System.out.print("Has indroducido una palabra 3 veces");
   
    }
    
}
