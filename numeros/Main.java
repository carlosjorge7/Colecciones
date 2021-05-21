package numeros;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {

        File file = new File("numeros/numeros.txt");
        if(!file.exists()){
            System.out.println("No existe");
            return;
        }
        try{
            Scanner fScanner = new Scanner(file);
            String linea;
            BufferedWriter bwPares = new BufferedWriter(new FileWriter(new File("numeros/pares.txt")));
            BufferedWriter bwPrimos = new BufferedWriter(new FileWriter(new File("numeros/primos.txt")));
            BufferedWriter bwImpares = new BufferedWriter(new FileWriter(new File("numeros/impares.txt")));
            while(fScanner.hasNextLine()){
                linea = fScanner.nextLine();
                if(esPar(Integer.parseInt(linea))){
                    bwPares.write(linea + "\r\n");
                }
                else{
                    bwImpares.write(linea + "\r\n");
                }
                if(esPrimo(Integer.parseInt(linea))){
                    bwPrimos.write(linea + "\r\n");
                } 
            }
            fScanner.close();
            bwPares.close();
            bwPrimos.close();
            bwImpares.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Error de lectura de fichero");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Error de escritura del fichero");
            e.printStackTrace();
        }
    }

    public static boolean esPar(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean esPrimo(int num){
        if(num == 1 || num == 2){
            return true;
        }
        int contDiv = 0;
        for(int div = 1; div <= num; div++){
            if(num % div == 0){
                contDiv++;
            }
        }
        if(contDiv == 1 || contDiv == 2){
            return true;
        }
        return false;
    }
}